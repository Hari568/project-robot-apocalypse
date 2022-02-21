package com.challagundla.hari.robotapocalypse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.challagundla.hari.robotapocalypse.models.SurvivorEntity;

@Repository
public interface SurvivorRepository extends CrudRepository<SurvivorEntity, String> {

}
