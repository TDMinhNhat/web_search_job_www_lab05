package dev.skyherobrine.app.backend.repositories;

import dev.skyherobrine.app.backend.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
    List<Experience> findByCandidate_Id(Long id);
}