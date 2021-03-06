Java 9 Flow API implements the Reactive Streams Specification. Flow API is a combination of Iterator and Observer pattern. Iterator works on pull model where application pulls items from the source, whereas Observer works on push model and reacts when item is pushed from source to application.

Java 9 Flow API subscriber can request for N items while subscribing to the publisher. Then the items are pushed from publisher to subscriber until there are no more items left to push or some error occurs.


Java 9 Flow API Classes and Interfaces
Let’s have a quick look at Flow API classes and interfaces.

java.util.concurrent.Flow: This is the main class of Flow API. This class encapsulates all the important interfaces of the Flow API. This is a final class and we can’t extend it.
java.util.concurrent.Flow.Publisher: This is a functional interface and every publisher has to implement it’s subscribe method to add the given subscriber to receive messages.
java.util.concurrent.Flow.Subscriber: Every subscriber has to implement this interface. The methods in the subscriber are invoked in strict sequential order. There are four methods in this interface:
onSubscribe: This is the first method to get invoked when subscriber is subscribed to receive messages by publisher. Usually we invoke subscription.request to start receiving items from processor.
onNext: This method gets invoked when an item is received from publisher, this is where we implement our business logic to process the stream and then request for more data from publisher.
onError: This method is invoked when an irrecoverable error occurs, we can do cleanup taks in this method, such as closing database connection.
onComplete: This is like finally method and gets invoked when no other items are being produced by publisher and publisher is closed. We can use it to send notification of successful processing of stream.
java.util.concurrent.Flow.Subscription: This is used to create asynchronous non-blocking link between publisher and subscriber. Subscriber invokes its request method to demand items from publisher. It also has cancel method to cancel the subscription i.e. closing the link between publisher and subscriber.
java.util.concurrent.Flow.Processor: This interface extends both Publisher and Subscriber, this is used to transform the message between publisher and subscriber.
java.util.concurrent.SubmissionPublisher: A Publisher implementation that asynchronously issues submitted items to current subscribers until it is closed. It uses Executor framework We will use this class in reactive stream examples to add subscriber and then submit items to them.