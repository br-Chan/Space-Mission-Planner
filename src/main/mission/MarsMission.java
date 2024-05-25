package main.mission;

import main.Prototype;
import main.missiondetails.MissionDetails;

public class MarsMission extends Mission {

    public MarsMission(MissionDetails missionDetails) {
        super(missionDetails);
    }

    @Override
    public String getDetails() {
        return "Mars Mission";
    }

    @Override
    public Prototype copy() {
        return new MarsMission(missionDetails);
    }

}
