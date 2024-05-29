package com.sparky.quiz.controller;

import com.sparky.quiz.models.Question;
import com.sparky.quiz.service.question.QuestionService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for managing questions in the quiz application.
 */
@RestController
@RequestMapping(value = "/question", produces = "application/json")
@Data
@Slf4j
public class QuestionController {

    @Autowired
    private final QuestionService questionService;

    /**
     * Retrieves all questions from the database.
     *
     * @return a list of all questions.
     */
    @GetMapping()
    public List<Question> getAllQuestions() {
        log.info("Fetching all questions");
        return questionService.getAllQuestions();
    }
}
