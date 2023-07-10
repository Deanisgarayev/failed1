package com.exam.examspring.controller;

import com.exam.examspring.Question;
import com.exam.examspring.interfaces.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class QuestionController {
    QuestionService questionService;
@Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @GetMapping("/add")
    Question add(String question, String answer) {
        return questionService.add(question, answer);
    }
    @GetMapping("/add")
    Question add(Question question) {
        return questionService.add(question);
    }
    @GetMapping("/remove")
    Question remove(Question question) {
        return questionService.remove(question);
    }
    @GetMapping("/getAll")
    Collection<Question> getAll() {
        return questionService.getAll();
    }
    @GetMapping("/getRandomQuestion")
    Question getRandomQuestion() {
        return questionService.getRandomQuestion();
    }

}
