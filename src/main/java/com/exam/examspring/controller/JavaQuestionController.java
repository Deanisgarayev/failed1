package com.exam.examspring.controller;

import com.exam.examspring.repository.Question;
import com.exam.examspring.interfaces.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    QuestionService questionService;
@Autowired
    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @GetMapping(value = "/add", params= "answer" )
    Question add(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return questionService.add(question, answer);
    }
    @GetMapping("/add")
    Question add(@RequestParam Question question) {
        return questionService.add(question);
    }
    @GetMapping("/remove")
    Question remove(@RequestParam Question question) {
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
