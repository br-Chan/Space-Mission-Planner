package main.mission;

public class MissionFactory {

    public static Mission createMission(String type) {
        switch (type) {
            case "Lunar":
                return new LunarMission();
            
            case "Mars":
                return new MarsMission();
            default:
                return null;
        }
    }

}
