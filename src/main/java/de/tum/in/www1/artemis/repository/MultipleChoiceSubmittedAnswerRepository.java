package de.tum.in.www1.artemis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import de.tum.in.www1.artemis.domain.quiz.MultipleChoiceSubmittedAnswer;

/**
 * Spring Data JPA repository for the MultipleChoiceSubmittedAnswer entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MultipleChoiceSubmittedAnswerRepository extends JpaRepository<MultipleChoiceSubmittedAnswer, Long> {

    @Query("select distinct mc_submitted_answer from MultipleChoiceSubmittedAnswer mc_submitted_answer left join fetch mc_submitted_answer.selectedOptions")
    List<MultipleChoiceSubmittedAnswer> findAllWithEagerRelationships();

    @Query("select mc_submitted_answer from MultipleChoiceSubmittedAnswer mc_submitted_answer left join fetch mc_submitted_answer.selectedOptions where mc_submitted_answer.id =:id")
    MultipleChoiceSubmittedAnswer findOneWithEagerRelationships(@Param("id") Long id);

}
