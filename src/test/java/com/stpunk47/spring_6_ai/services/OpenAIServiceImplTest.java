package com.stpunk47.spring_6_ai.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpenAIServiceImplTest {

    @Autowired
    OpenAIService openAIService;

    @Test
    void getAnswer() {

        String answer =
                openAIService.getAnswer("Write a Java code to display " +
                        "the content of the given String value");

        System.out.println("Got the answer");
        System.out.println(answer);
    }
}