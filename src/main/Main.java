package main;

import main.mission.Mission;
import main.mission.MissionFactory;
import main.missiondetails.MissionDetails;

public class Main {
    public static void main(String[] args) {
        // Using Factory Pattern and Builder Pattern
        Mission lunarMission = MissionFactory.createMission(
                "Lunar",
                new MissionDetails.Builder("Aloppo 11", 8, "Tasurn V")
                        .setCrewSize(3)
                        .build()
        );
        Mission marsMission = MissionFactory.createMission(
                "Mars",
                new MissionDetails.Builder("Mars One", 180, "Orion")
                        .addRobot("TARS-4612")
                        .build()
        );

        System.out.println("Factory Pattern:");
        System.out.println(lunarMission.getDetails());
        System.out.println(marsMission.getDetails());

        // Using Prototype Pattern
        Mission clonedLunarMission = (Mission) lunarMission.copy();
        Mission clonedMarsMission = (Mission) marsMission.copy();

        System.out.println("\nPrototype Pattern:");
        System.out.println("Cloned " + clonedLunarMission.getDetails());
        System.out.println("Cloned " + clonedMarsMission.getDetails());
    }
}
