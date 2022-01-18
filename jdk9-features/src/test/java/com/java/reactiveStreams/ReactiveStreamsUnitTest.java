package com.java.reactiveStreams;

import com.java.reactiveStreams.Subscriber.MyFreelancerSubscriber;
import com.java.reactiveStreams.Subscriber.MySubscriber;
import com.java.reactiveStreams.processor.MyProcessor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;
public class ReactiveStreamsUnitTest {

    @Test
    public void givenPublisher_whenSubscribeToIt_thenShouldConsumeAllElements()
            throws InterruptedException {
        //given
        SubmissionPublisher<Employee> publisher = new SubmissionPublisher<>();
//        MyProcessor transformProcessor = new MyProcessor(s -> {
//            return new Freelancer(s.getId(), s.getId() + 100, s.getName());
//        });
        MySubscriber<Employee> subscriber = new MySubscriber<>(6);
        publisher.subscribe(subscriber);
        List<Employee> items=EmpHelper.getEmps();

        //when
        assertThat(publisher.getNumberOfSubscribers()).isEqualTo(1);
        items.forEach(publisher::submit);
        publisher.close();

        //then
        await().atMost(1000, TimeUnit.MILLISECONDS)
                .untilAsserted(() -> assertThat(subscriber.consumedElements)
                        .containsExactlyElementsOf(items)
        );
    }



}
