package com.exam.examspring.service;

import com.exam.examspring.Exceptions.ItAlreadyExistsException;
import com.exam.examspring.Exceptions.ItIsAbsentException;
import com.exam.examspring.repository.Question;
import com.exam.examspring.interfaces.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    public List<Question> questList = new ArrayList<>();
    private final Random random;

    public JavaQuestionService( Random random) {
        this.random = random;
    }

    public int getRandomInt() {
        return random.nextInt();
    }
    @Override
    public Question add(String question, String answer) {
        Question quest = new Question(question, answer);
        if (questList.contains(quest)) {
            throw new ItAlreadyExistsException("You can't add it again");
        }
        questList.add(quest);
        return quest;
    }

    @Override
    public Question add(Question question) {
        if (questList.contains(question)) {
            throw new ItAlreadyExistsException("You can't add it again");
        }
        questList.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questList.contains(question)) {
             questList.remove(question);
            return question;
        }
        throw new ItIsAbsentException("You can't remove that isn't there");
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableCollection(questList);
    }

    @Override
    public Question getRandomQuestion() {
        return questList.get(getRandomInt());
    }
}
