package main.adapters;

import main.mission.MarsMission;
import main.mission.Mission;
import main.missiondetails.MissionDetails;

public class LunarToMarsAdapter implements Converter {

    @Override
    public Mission convert(Mission mission) {
        MissionDetails missionDetails = mission.getMissionDetails();

        Mission marsMission = new MarsMission(
                new MissionDetails.Builder(
                        missionDetails.getName(),
                        "Mars",
                        missionDetails.getDuration(),
                        missionDetails.getSpacecraft()
                )
                        .addRobot(missionDetails.getRobotName())
                        .build()
        );

        return marsMission;
    }

}