package com.challagundla.hari.robotapocalypse.repositories;

import com.challagundla.hari.robotapocalypse.models.Robot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RobotRepository extends CrudRepository<Robot, String> {

}
