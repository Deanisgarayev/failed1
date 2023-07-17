package com.exam.examspring;

import com.exam.examspring.Exceptions.ItAlreadyExistsException;
import com.exam.examspring.configuration.JavaConfiguration;
import com.exam.examspring.interfaces.QuestionService;
import com.exam.examspring.repository.Question;
import com.exam.examspring.service.JavaQuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class JavaQuestionServiceTest {
    @Mock
    JavaConfiguration javaConfiguration;
    @InjectMocks
    JavaQuestionService out;

//    @Test
//    public void ShouldBeEqualWhenAdd() {
//        Question quest = new Question("firstQuestion", "firstAnswer");
//        Question result = out.add("firstQuestion", "firstAnswer");
//        assertEquals(result, quest);
//    }
//        @Test
//    public void ShouldThrowExceptionWhenAddSameThings() {
//         out.add("firstQuestion", "firstAnswer");
//        assertThrows(ItAlreadyExistsException.class,
//                () -> out.add("firstQuestion", "firstAnswer"));
//    }
//
//    @Test
//    public void getAllTest() {
//        Set<Question> result = new HashSet<>(Set.of(
//                out.add("first", "first"),
//                out.add("second", "second"),
//                out.add("third", "third")
//        ));
//        Set<Question> getAll = new HashSet<>(out.getAll());
//        Assertions.assertIterableEquals(result, getAll);
//    }
}
