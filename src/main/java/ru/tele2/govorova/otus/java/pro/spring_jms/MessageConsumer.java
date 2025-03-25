package ru.tele2.govorova.otus.java.pro.spring_jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "my-topic")
    public void receiveMessage(Message message) {
        System.out.println("Received message: " + message);
    }
}
