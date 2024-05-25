package main.missiondetails;

public class MissionDetails {
    private String name; // mandatory
    private String destination; // mandatory
    private int duration; // mandatory
    private String spacecraft; // mandatory
    private int crewSize = 0; // optional with default value
    private boolean hasRobot = false; // optional with default value
    private String robotName; // optional with default value

    private MissionDetails(Builder builder) {
        this.name = builder.name;
        this.destination = builder.destination;
        this.duration = builder.duration;
        this.spacecraft = builder.spacecraft;
        this.crewSize = builder.crewSize;
        this.hasRobot = builder.hasRobot;
        this.robotName = builder.robotName;
        
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public int getDuration() {
        return duration;
    }

    public String getSpacecraft() {
        return spacecraft;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public boolean isHasRobot() {
        return hasRobot;
    }

    public String getRobotName() {
        return robotName;
    }

    public static class Builder {
        private String name; // mandatory
        private String destination; // mandatory
        private int duration; // mandatory
        private String spacecraft; // mandatory
        private int crewSize = 0; // optional with default value
        private boolean hasRobot = false; // optional with default value
        private String robotName; // optional with default value

        public Builder (String name, String destination, int duration, String spacecraft) {
            this.name = name;
            this.destination = destination;
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

    @Override
    public String toString() {
        return "MissionDetails [name=" + name + ", destination=" + destination + ", duration=" + duration
                + ", spacecraft=" + spacecraft + ", crewSize=" + crewSize + ", hasRobot=" + hasRobot + ", robotName="
                + robotName + "]";
    }

    

}
