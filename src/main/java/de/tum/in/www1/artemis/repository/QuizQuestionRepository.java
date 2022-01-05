package de.tum.in.www1.artemis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.tum.in.www1.artemis.domain.quiz.QuizQuestion;

/**
 * Spring Data JPA repository for the QuizQuestion entity.
 */
@SuppressWarnings("unused")
@Repository
public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long> {

}
