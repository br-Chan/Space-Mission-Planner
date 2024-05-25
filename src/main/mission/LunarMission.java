package main.mission;

import main.missiondetails.MissionDetails;

public class LunarMission extends Mission {

    public LunarMission(MissionDetails missionDetails) {
        super(missionDetails);
    }

    @Override
    public Prototype copy() {
        return new LunarMission(new MissionDetails.Builder(missionDetails.getName(), missionDetails.getDestination(), missionDetails.getDuration(), missionDetails.getSpacecraft())
        .setCrewSize(missionDetails.getCrewSize())
        .addRobot(missionDetails.getRobotName())
        .build());
    }

}
