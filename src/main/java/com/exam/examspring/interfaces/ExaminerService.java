package com.exam.examspring.interfaces;

import com.exam.examspring.repository.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
