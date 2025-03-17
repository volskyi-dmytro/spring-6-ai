package com.stpunk47.spring_6_ai.services;


import com.stpunk47.spring_6_ai.model.Answer;
import com.stpunk47.spring_6_ai.model.Question;

public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);
}
