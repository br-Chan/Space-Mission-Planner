package main;

import main.mission.Mission;
import main.mission.MissionFactory;
import main.missiondetails.MissionDetails;

public class Main {
    public static void main(String[] args) {
        // Using Factory Pattern and Builder Pattern
        Mission lunarMission = MissionFactory.createMission(
                new MissionDetails.Builder("Aloppo 11", "Moon", 8, "Tasurn V")
                        .setCrewSize(3)
                        .build());
        Mission marsMission = MissionFactory.createMission(
                new MissionDetails.Builder("Mars One", "Mars", 180, "Orion")
                        .addRobot("Sparky")
                        .build());

        // Using Prototype Pattern
        Mission clonedLunarMission = (Mission) lunarMission.copy();
        Mission clonedMarsMission = (Mission) marsMission.copy();

        System.out.println("Factory and Builder Pattern:");
        System.out.println(lunarMission.getMissionDetails());
        System.out.println(marsMission.getMissionDetails());

        System.out.println("\nPrototype Pattern:");
        System.out.println("Cloned " + clonedLunarMission.getMissionDetails());
        System.out.println("Cloned " + clonedMarsMission.getMissionDetails());
    }
}
