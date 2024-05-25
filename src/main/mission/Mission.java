package main.mission;

import main.Prototype;
import main.missiondetails.MissionDetails;

public abstract class Mission implements Prototype {
    protected MissionDetails missionDetails;

    public Mission(MissionDetails missionDetails) {
        this.missionDetails = missionDetails;
    }

    public abstract String getDetails();

    public abstract Prototype copy();

}
