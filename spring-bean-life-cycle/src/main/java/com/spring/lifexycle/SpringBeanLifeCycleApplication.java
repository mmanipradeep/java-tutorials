package com.spring.lifexycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringBeanLifeCycleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBeanLifeCycleApplication.class, args);
// – -----awareinterfaces---------
//        ApplicationContext context1 =
//                new ClassPathXmlApplicationContext("beans.xml");
//        AwareBeanImpl awareBeanImpl = (AwareBeanImpl) context1.getBean("awareBean");
//        ((AbstractApplicationContext) context1).registerShutdownHook();


      //  SpringApplication.run(SpringBeanLifecycleApplication.class, args);
// – -----beanpostprocessor------
//        ApplicationContext context4 =
//                new ClassPathXmlApplicationContext("beans.xml");
//        BookBean bookBean = (BookBean) context4.getBean("bookBeanPost");
//        ((AbstractApplicationContext) context4).registerShutdownHook();


        // – -----callbackinterfaces-------
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("beans.xml");
//        Book book = (Book) context.getBean("bookBean");
//        System.out.println(book.getBookName());
//        ((AbstractApplicationContext) context).registerShutdownHook();

        ApplicationContext context3 =
                new ClassPathXmlApplicationContext("beans.xml");
        BookCustomBean bookCustomBean = (BookCustomBean) context3.getBean("customLifeCycleBookBean");
        ((AbstractApplicationContext) context3).registerShutdownHook();
    }
}
