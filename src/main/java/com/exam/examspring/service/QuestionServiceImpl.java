package com.exam.examspring.service;

import com.exam.examspring.Question;
import com.exam.examspring.interfaces.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class QuestionServiceImpl implements QuestionService {
    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
