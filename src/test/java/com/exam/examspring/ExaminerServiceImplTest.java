package com.exam.examspring;

import com.exam.examspring.repository.Question;
import com.exam.examspring.service.JavaQuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ExaminerServiceImplTest {
    @Mock
    JavaQuestionService javaQuestionService;
    @InjectMocks
    ExaminerServiceImplTest out;

//    @BeforeEach
//    public void setUp() {
//        Mockito.when(javaQuestionService.getAll()).thenReturn(questionList());
    }

//    private List<Question> questionList() {
//        return new ArrayList<>(list.of( new Question("first", "first"),
//                new Question("second","second"),
//                new Question("third", "third"),
//                new Question("forth", "forth"),
//                new Question("fifth", "fifth"),
//                new Question("sixth", "sixth"),
//                new Question("seventh", "seventh")
//        ));
//    }
//}
