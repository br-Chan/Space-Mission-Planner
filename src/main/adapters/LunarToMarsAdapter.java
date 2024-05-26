package main.adapters;

import main.mission.MarsMission;
import main.mission.Mission;
import main.missiondetails.MissionDetails;

public class LunarToMarsAdapter implements Converter {

    @Override
    public Mission convert(Mission mission) {
        MissionDetails missionDetails = mission.getMissionDetails();

        Mission marsMission = new MarsMission(new MissionDetails.Builder(missionDetails.getName(), missionDetails.getDestination(), missionDetails.getDuration(), missionDetails.getSpacecraft(), missionDetails.getMissionTeam())
        .addThrusters(missionDetails.getThrusters() - 1)
        .build());

        if (mission.getMissionDetails().hasReturnTrip()) mission.getMissionDetails().addReturnTrip();

        return marsMission;
    }

}
