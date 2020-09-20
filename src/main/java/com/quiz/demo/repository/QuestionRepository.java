package com.quiz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.demo.entity.QuestionEntity;


/**
 * QuestionRepository is the repository interface to perform operation on question entity.
 * 
 * @author Mohan Chidambaram
 *
 */
@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {

}
