package main.mission;

import main.missiondetails.MissionDetails;

public abstract class Mission implements Prototype {
    protected MissionDetails missionDetails;

    public Mission(MissionDetails missionDetails) {
        this.missionDetails = missionDetails;
    }

    public MissionDetails getMissionDetails() {
        return missionDetails;
    }

    public abstract Prototype copy();

}
