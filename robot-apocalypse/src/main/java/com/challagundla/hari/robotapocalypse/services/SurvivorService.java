package com.challagundla.hari.robotapocalypse.services;

import com.challagundla.hari.robotapocalypse.models.LastLocation;
import com.challagundla.hari.robotapocalypse.models.Reports;
import com.challagundla.hari.robotapocalypse.models.Survivor;


public interface SurvivorService {

    void addSurvivors(Survivor survivor);
    void updateSurvivorLocation(String id, LastLocation lastLocation);
    void updateSurvivorStatus(String survivorId, String reporterId);
    Reports getReports();
}
