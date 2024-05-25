package main.mission;

import main.missiondetails.MissionDetails;

public class MissionFactory {

    public static Mission createMission(MissionDetails missionDetails) {
        switch (missionDetails.getDestination()) {
            case "Moon":
                return new LunarMission(missionDetails);
            
            case "Mars":
                return new MarsMission(missionDetails);
            default:
                return null;
        }
    }

}
