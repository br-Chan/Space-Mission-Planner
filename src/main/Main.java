package main;

import main.adapters.LunarToMarsAdapter;
import main.adapters.MarsToLunarAdapter;
import main.composite.CrewMember;
import main.composite.Robot;
import main.composite.TeamComposite;
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
        Mission clonedMarsMission = (Mission) marsMission.copy();

        System.out.println("\nPrototype and Adapter Pattern:");
        System.out.println("\nCloned: " + clonedMarsMission.getMissionDetails());
        MarsToLunarAdapter marsToLunar = new MarsToLunarAdapter();
        Mission convertedLunarMission = marsToLunar.convert(clonedMarsMission);
        System.out.println("\nThen Converted: " + convertedLunarMission.getMissionDetails());



        // Composite Pattern
        System.out.println("\nComposite Pattern:");
        CrewMember commander1 = new CrewMember("John Doe", "Commander", 1);
        CrewMember engineer1 = new CrewMember("Jane Smith", "Engineer", 2);
        CrewMember engineer2 = new CrewMember("John Smith", "Engineer", 4);
        CrewMember engineer3 = new CrewMember("Calico Shmalico", "Engineer", 4);
        CrewMember engineer4 = new CrewMember("Henry Ly", "Engineer", 3);
        CrewMember engineer5 = new CrewMember("Brandon Chan", "Engineer", 5);
        CrewMember engineer6 = new CrewMember("Fred Oktopus", "Engineer", 5);
        Robot robot1 = new Robot("Vision", "Advisor", "A113");

        TeamComposite committee = new TeamComposite("Master Commander Committee");
        committee.addEntity(commander1);
        committee.addEntity(engineer1);
        committee.addEntity(robot1);

        TeamComposite engineering = new TeamComposite("Engineering Division");
        engineering.addEntity(engineer1);
        engineering.addEntity(engineer2);
        engineering.addEntity(engineer3);
        engineering.addEntity(engineer4);
        engineering.addEntity(engineer5);
        engineering.addEntity(engineer6);

        committee.displayDetails();
    }
}
