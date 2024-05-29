package com.sparky.quiz.service.question;

import com.sparky.quiz.models.Question;
import com.sparky.quiz.repository.QuestionRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the QuestionService interface for managing questions.
 */
@Service
@Data
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private final QuestionRepository questionRepository;

    /**
     * Retrieves all questions from the database.
     *
     * @return a list of all questions.
     */
    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    /**
     * Deletes a question from the database by its ID.
     *
     * @param id the ID of the question to be deleted.
     */
    @Override
    public void deleteQuestionById(int id) {
        questionRepository.deleteById(id);
    }

    /**
     * Deletes a given question from the database.
     *
     * @param question the question to be deleted.
     */
    @Override
    public void deleteQuestion(Question question) {
        questionRepository.delete(question);
    }

    /**
     * Creates a new question and saves it to the database.
     *
     * @param question the question to be created.
     * @return the created question with any generated ID or additional fields.
     */
    @Override
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }
}
