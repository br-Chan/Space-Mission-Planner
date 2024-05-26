package main.adapters;

import main.mission.LunarMission;
import main.mission.MarsMission;
import main.mission.Mission;
import main.missiondetails.MissionDetails;

public class MarsToLunarAdapter implements Converter {

    @Override
    public Mission convert(Mission mission) {
        MissionDetails missionDetails = mission.getMissionDetails();

        Mission lunarMission = new LunarMission(new MissionDetails.Builder(missionDetails.getName(), missionDetails.getDestination(), missionDetails.getDuration(), missionDetails.getSpacecraft(), missionDetails.getMissionTeam())
        .addThrusters(missionDetails.getThrusters() - 1)
        .build());

        if (mission.getMissionDetails().hasReturnTrip()) mission.getMissionDetails().addReturnTrip();

        return lunarMission;
    }

}
