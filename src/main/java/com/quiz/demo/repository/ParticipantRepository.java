package com.quiz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.demo.entity.ParticipantEntity;

/**
 * ParticipantRepository is the repository interface to perform operation on participant entity.
 * 
 * @author Mohan Chidambaram
 *
 */
@Repository
public interface ParticipantRepository extends JpaRepository<ParticipantEntity, Integer>{

}
