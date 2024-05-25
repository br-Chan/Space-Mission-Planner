package main;

import main.mission.Mission;
import main.mission.MissionFactory;

public class Main {
    public static void main(String[] args) {
        // Using Factory Pattern
        Mission lunarMission = MissionFactory.createMission("Lunar");
        Mission marsMission = MissionFactory.createMission("Mars");

        System.out.println("Factory Pattern:");
        System.out.println(lunarMission.getDetails());
        System.out.println(marsMission.getDetails());

        // Using Builder Pattern
        MissionBuilder builder = new MissionBuilder();
        MissionDetails lunarMissionDetails = builder
                .setName("Apollo 11")
                .setDuration(8)
                .setSpacecraft("Saturn V")
                .setCrewSize(3)
                .build();

        MissionDetails marsMissionDetails = builder
                .setName("Mars One")
                .setDuration(180)
                .setSpacecraft("Orion")
                .setCrewSize(6)
                .build();

        System.out.println("\nBuilder Pattern:");
        System.out.println(lunarMissionDetails);
        System.out.println(marsMissionDetails);

        // Using Prototype Pattern
        Mission clonedLunarMission = (Mission) lunarMission.copy();
        Mission clonedMarsMission = (Mission) marsMission.copy();

        System.out.println("\nPrototype Pattern:");
        System.out.println("Cloned " + clonedLunarMission.getDetails());
        System.out.println("Cloned " + clonedMarsMission.getDetails());
    }
}
