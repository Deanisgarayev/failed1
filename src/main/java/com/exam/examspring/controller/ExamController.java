package com.exam.examspring.controller;

import com.exam.examspring.interfaces.ExaminerService;
import com.exam.examspring.repository.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/Exam")
public class ExamController {
    private final ExaminerService examinerService;
@Autowired
    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/getQuestions")
    public Collection<Question> getQuestions(int amount) {
        return examinerService.getQuestions(amount);
    }
}
