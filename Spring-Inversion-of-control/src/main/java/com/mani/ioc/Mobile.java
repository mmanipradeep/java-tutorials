package com.mani.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {
//        Airtel airtel = new Airtel();
//        airtel.calling();
//        airtel.data();
//// Runtime Inheritance
//        Sim sim =new Vodafone();

        ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(context.getBean("sim"));
       // Sim airtel = (Airtel) context.getBean("sim");
        //System.out.println(airtel);

    }
}
