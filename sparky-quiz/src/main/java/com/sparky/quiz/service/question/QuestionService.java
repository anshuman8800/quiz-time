package com.sparky.quiz.service.question;

import com.sparky.quiz.models.Question;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service interface for managing questions in the quiz application.
 */
@Service
public interface QuestionService {

    /**
     * Retrieves all questions from the database.
     *
     * @return a list of all questions.
     */
    public List<Question> getAllQuestions();

    /**
     * Deletes a question from the database by its ID.
     *
     * @param id the ID of the question to be deleted.
     */
    public void deleteQuestionById(int id);

    /**
     * Deletes a given question from the database.
     *
     * @param question the question to be deleted.
     */
    public void deleteQuestion(Question question);

    /**
     * Creates a new question and saves it to the database.
     *
     * @param question the question to be created.
     * @return the created question with any generated ID or additional fields.
     */
    public Question createQuestion(Question question);
}
