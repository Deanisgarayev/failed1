package com.exam.examspring;

import com.exam.examspring.configuration.JavaConfiguration;
import com.exam.examspring.interfaces.QuestionService;
import com.exam.examspring.service.JavaQuestionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class JavaQuestionServiceTest {
    @Mock
    JavaConfiguration javaConfiguration;
    @InjectMocks
    JavaQuestionService out;
}
