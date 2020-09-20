package com.quiz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.demo.entity.AnswerEntity;

/**
 * AnswerRepository is the repository interface to perform operation on answer entity.
 * 
 * @author Mohan Chidambaram
 *
 */
@Repository
public interface AnswerRepository extends JpaRepository<AnswerEntity, Integer> {

}
