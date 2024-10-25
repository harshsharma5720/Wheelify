package com.nexonsolution.My.project.repository;

import com.nexonsolution.My.project.entity.TripPreparationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripPreparationRepository extends JpaRepository<TripPreparationEntity,Long> {
}
