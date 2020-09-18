package com.quiz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.demo.entity.QuestionEntity;


/**
 * QuestionModel is the model class for the question entity.
 * 
 * @author Mohan Chidambaram
 *
 */
@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {

}
