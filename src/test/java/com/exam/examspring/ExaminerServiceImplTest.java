package com.exam.examspring;

import com.exam.examspring.repository.Question;
import com.exam.examspring.service.JavaQuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExaminerServiceImplTest {
    @Mock
    JavaQuestionService javaQuestionService;
    @InjectMocks
    ExaminerServiceImplTest out;

    @BeforeEach
    public void setUp() {
        Mockito.when(javaQuestionService.getAll()).thenReturn(questSet());
    }

    private Set<Question> questSet() {
        return new HashSet<>(Set.of( new Question("first", "first"),
                new Question("second","second"),
                new Question("third", "third"),
                new Question("forth", "forth"),
                new Question("fifth", "fifth"),
                new Question("sixth", "sixth"),
                new Question("seventh", "seventh")
        ));
    }
}
