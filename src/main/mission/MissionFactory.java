package main.mission;

import main.missiondetails.MissionDetails;

public class MissionFactory {

    public static Mission createMission(String type, MissionDetails missionDetails) {
        switch (type) {
            case "Lunar":
                return new LunarMission(missionDetails);
            
            case "Mars":
                return new MarsMission(missionDetails);
            default:
                return null;
        }
    }

}
