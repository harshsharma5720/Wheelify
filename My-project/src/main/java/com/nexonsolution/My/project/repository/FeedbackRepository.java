package com.nexonsolution.My.project.repository;

import com.nexonsolution.My.project.entity.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<FeedbackEntity,Long> {
}
