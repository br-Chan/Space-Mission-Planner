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
        TeamComposite lunarTeam = new TeamComposite("Lucky Lunar Team");
        Mission lunarMission = MissionFactory.createMission(
                new MissionDetails.Builder("Aloppo 11", "Moon", 8, "Tasurn V", lunarTeam)
                        .addReturnTrip()
                        .build());
        TeamComposite marsTeam = new TeamComposite("Magical Mars Team");
        Mission marsMission = MissionFactory.createMission(
                new MissionDetails.Builder("Phar Lap One", "Mars", 180, "Orion", marsTeam)
                        .addThrusters(5)
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
        CrewMember engineer2 = new CrewMember("John Smith", "Engineer", 3);
        CrewMember engineer3 = new CrewMember("Calico Shmalico", "Engineer", 3);
        CrewMember engineer4 = new CrewMember("Henry Ly", "Engineer", 4);
        CrewMember engineer5 = new CrewMember("Brandon Chan", "Engineer", 4);
        CrewMember engineer6 = new CrewMember("Fred Oktopus", "Engineer", 5);
        CrewMember astro1 = new CrewMember("Zubb DarkDay", "Space Walker", 1);
        CrewMember astro2 = new CrewMember("Matthew Macon O'hay", "Space Walker", 2);
        CrewMember astro3 = new CrewMember("J Jonah Jameson's Son", "Space Walker", 3);
        Robot robot1 = new Robot("Vision", "Advisor");
        Robot robot2 = new Robot("EngGPT 12-yotta", "Engineering");

        TeamComposite committee = new TeamComposite("Master Commander Committee");
        committee.addEntity(commander1);
        committee.addEntity(engineer1);
        committee.addEntity(astro1);
        committee.addEntity(robot1);

        TeamComposite engineering = new TeamComposite("Engineering Division");
        engineering.addEntity(engineer1);
        engineering.addEntity(engineer2);
        engineering.addEntity(engineer3);
        engineering.addEntity(engineer4);
        engineering.addEntity(engineer5);
        engineering.addEntity(engineer6);
        engineering.addEntity(robot2);

        TeamComposite spaceWalkers = new TeamComposite("Space Walkers");
        spaceWalkers.addEntity(astro1);
        spaceWalkers.addEntity(astro2);
        spaceWalkers.addEntity(astro3);

        marsTeam.addEntity(committee);
        marsTeam.addEntity(engineering);
        marsTeam.addEntity(spaceWalkers);

        marsTeam.displayDetails();
    }
}
