package com.challagundla.hari.robotapocalypse.repositories;

import java.util.List;

import com.challagundla.hari.robotapocalypse.models.SurvivorAuditEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurvivorAuditRepository extends CrudRepository<SurvivorAuditEntity, Integer> {

    List<SurvivorAuditEntity> findBysurvivorIdContaining(String survivorId);

}
