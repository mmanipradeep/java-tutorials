package com.test;


import model.Payment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.transaction.support.TransactionCallback;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.transaction.annotation.Propagation.NOT_SUPPORTED;

@DataJpaTest
@ActiveProfiles("test")
@Transactional(propagation = NOT_SUPPORTED)
public class UserServerTest {

    @Autowired
    TransactionTemplate transactionTemplate;


    @Autowired
    private EntityManager entityManager;


    @Test
    void givenAPayment_WhenNotExpectingAnyResult_ThenShouldCommit() {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                Payment payment = new Payment();
                payment.setReferenceNumber("Ref-1");
                payment.setState(Payment.State.SUCCESSFUL);

                entityManager.persist(payment);
            }
        });

        assertThat(entityManager.createQuery("select p from Payment p").getResultList()).hasSize(1);
    }
}
