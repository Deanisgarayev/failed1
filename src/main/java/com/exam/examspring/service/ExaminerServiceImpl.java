package com.exam.examspring.service;

import com.exam.examspring.interfaces.ExaminerService;
import com.exam.examspring.interfaces.QuestionService;
import com.exam.examspring.repository.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;
@Autowired
    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        return questionService.getAll();
//        Его задача: создать коллекцию и заполнить её с помощью вызова getRandomQuestion у QuestionService случайными вопросами.
//
//                Учтите:
//
//        1.  Вопросы должны быть уникальные, следовательно, для получения 5 вопросов может потребоваться более 5 вызовов
//        метода getRandomQuestion сервиса вопросов.
//        2. Если запрошено большее количество вопросов, чем хранится в сервисе, нужно выкинуть исключение. Для этого,
//        соответственно, нужно написать свое исключение со статусом BAD_REQUEST.
    }
}
