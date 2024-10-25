package com.nexonsolution.My.project.repository;

import com.nexonsolution.My.project.entity.ModificationRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModificationRequestRepository extends JpaRepository<ModificationRequestEntity,Long> {

    List<ModificationRequestEntity> findSuggestionsByCarDetails(String make, Integer model);
}
