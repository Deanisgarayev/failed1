package com.exam.examspring.controller;

import com.exam.examspring.interfaces.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam/java")
public class QuestionController {
    QuestionService questionService;
@Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @GetMapping("/add")

}
