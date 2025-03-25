package ru.tele2.govorova.otus.java.pro.spring_jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(String topic, String text) {
        Message message = new Message(UUID.randomUUID(), text);
        jmsTemplate.convertAndSend(topic, message);
        System.out.println("Sent message: " + message);
    }
}