package dev.skyherobrine.app.backend.repositories;

import dev.skyherobrine.app.backend.ids.JobSkillId;
import dev.skyherobrine.app.backend.models.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {
}