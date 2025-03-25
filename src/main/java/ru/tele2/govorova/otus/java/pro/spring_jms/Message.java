package ru.tele2.govorova.otus.java.pro.spring_jms;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message implements Serializable {
    private UUID uuid;
    private String text;
}