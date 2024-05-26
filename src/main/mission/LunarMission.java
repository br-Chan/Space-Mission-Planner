package main.mission;

import main.missiondetails.MissionDetails;

public class LunarMission extends Mission {

    public LunarMission(MissionDetails missionDetails) {
        super(missionDetails);
    }

    @Override
    public Prototype copy() {
        Mission mission = new LunarMission(new MissionDetails.Builder(missionDetails.getName(), missionDetails.getDestination(), missionDetails.getDuration(), missionDetails.getSpacecraft(), missionDetails.getMissionTeam())
        .addThrusters(missionDetails.getThrusters() - 1)
        .build());

        if (mission.getMissionDetails().hasReturnTrip()) mission.getMissionDetails().addReturnTrip();

        return mission;
    }

}
