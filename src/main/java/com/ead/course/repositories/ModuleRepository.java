package com.ead.course.repositories;

import com.ead.course.models.ModuleModel;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ModuleRepository extends CrudRepository<ModuleModel, UUID> {

    @EntityGraph(attributePaths = {"course"})
    ModuleModel findByTitle(String title);
}
