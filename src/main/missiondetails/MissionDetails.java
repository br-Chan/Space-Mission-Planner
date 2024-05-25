package main.missiondetails;

public class MissionDetails {
    private String name; // mandatory
    private int duration; // mandatory
    private String spacecraft; // mandatory
    private int crewSize = 0; // optional with default value
    private boolean hasRobot = false; // optional with default value
    private String robotName; // optional with default value

    private MissionDetails(Builder builder) {
        this.name = builder.name;
        this.duration = builder.duration;
        this.spacecraft = builder.spacecraft;
        this.crewSize = builder.crewSize;
        this.hasRobot = builder.hasRobot;
        
    }

    public static class Builder {
        private String name; // mandatory
        private int duration; // mandatory
        private String spacecraft; // mandatory
        private int crewSize = 0; // optional with default value
        private boolean hasRobot = false; // optional with default value
        private String robotName; // optional with default value

        public Builder (String name, int duration, String spacecraft) {
            this.name = name;
            this.duration = duration;
            this.spacecraft = spacecraft;
        }

        public Builder setCrewSize(int crewSize) {
            this.crewSize = crewSize;
            return this;
        }

        public Builder addRobot(String robotName) {
            this.hasRobot = true;
            this.robotName = robotName;
            return this;
        }

        public MissionDetails build() {
            return new MissionDetails(this);
        }

    }

}
