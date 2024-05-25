package main;

import main.adapters.LunarToMarsAdapter;
import main.adapters.MarsToLunarAdapter;
import main.mission.LunarMission;
import main.mission.MarsMission;
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

        System.out.println("Factory and Builder Pattern:");
        System.out.println(lunarMission.getMissionDetails());
        System.out.println(marsMission.getMissionDetails());

        // Using Prototype and Adapter Pattern
        Mission clonedLunarMission = (Mission) lunarMission.copy();
        Mission clonedMarsMission = (Mission) marsMission.copy();

        System.out.println("\nPrototype and Adapter Pattern:");
        System.out.println("\nCloned " + clonedLunarMission.getMissionDetails());
        LunarToMarsAdapter lunarToMars = new LunarToMarsAdapter();
        Mission convertedMarsMission = lunarToMars.convert(clonedLunarMission);
        System.out.println(convertedMarsMission.getMissionDetails());
        System.out.println(clonedLunarMission.getClass() + " " + convertedMarsMission.getClass());

        System.out.println("\nCloned " + clonedMarsMission.getMissionDetails());
        MarsToLunarAdapter marsToLunar = new MarsToLunarAdapter();
        Mission convertedLunarMission = marsToLunar.convert(clonedMarsMission);
        System.out.println(convertedLunarMission.getMissionDetails());



        // // Composite Pattern
        // System.out.println("\nComposite Pattern:");
        // CrewMember commander = new CrewMember("John Doe", "Commander", 1);
        // CrewMember engineer = new CrewMember("Jane Smith", "Engineer", 2);
        // Robot robot = new Robot("Robo1", "Sampling");

        // MissionComposite missionTeam = new MissionComposite();
        // missionTeam.add(commander);
        // missionTeam.add(engineer);
        // missionTeam.add(robot);

        // missionTeam.displayDetails();
    }
}
