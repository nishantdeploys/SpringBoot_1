package com.nishant.demo.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//here we user component becuse we do not need to create the object with the help of new keyword
//Spring will take care of the object creation when we declare @Component before the class
@Component
public class OrderService {

    //Filed Injection (if we want to connect OrderService with PaymentService by the help of field injection then we can use @Autowired)
//    @Autowired
    PaymentService paymentservice;

//    @Autowired
    OrderService(PaymentService paymentservice){
        this.paymentservice = paymentservice;
    }

    @Autowired
    public void serPaymentService(PaymentService paymentservice){
        this.paymentservice = paymentservice;
    }

    public void placeOrder() {
        paymentservice.pay();
        System.out.println("Order Placed");
    }

}

//Field Injection
//Constructor Injection
//Setter Injection

