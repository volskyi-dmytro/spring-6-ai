package com.stpunk47.spring_6_ai.controllers;

import com.stpunk47.spring_6_ai.model.Answer;
import com.stpunk47.spring_6_ai.model.Question;
import com.stpunk47.spring_6_ai.services.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {


    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping
    public Answer askQuestion(Question question) {
        return openAIService.getAnswer(question);
    }
}
