package main.mission;

import main.Prototype;
import main.missiondetails.MissionDetails;

public class LunarMission extends Mission {

    public LunarMission(MissionDetails missionDetails) {
        super(missionDetails);
    }

    @Override
    public Prototype copy() {
        return new LunarMission(missionDetails);
    }

}
