package main.missiondetails;

import main.composite.TeamComposite;

public class MissionDetails {
    private String name; // mandatory
    private String destination; // mandatory
    private int duration; // mandatory
    private String spacecraft; // mandatory
    private TeamComposite missionTeam; // mandatory
    private boolean returnTrip; // optional
    private int thrusters;

    private MissionDetails(Builder builder) {
        this.name = builder.name;
        this.destination = builder.destination;
        this.duration = builder.duration;
        this.spacecraft = builder.spacecraft;
        this.missionTeam = builder.missionTeam;
        this.returnTrip = builder.returnTrip;
        this.thrusters = builder.thrusters;
        
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
        return missionTeam.getSize();
    }
    
    public TeamComposite getMissionTeam() {
        return missionTeam;
    }

    public boolean hasReturnTrip() {
        return returnTrip;
    }

    public void addReturnTrip() {
        returnTrip = true;
    }

    public int getThrusters() {
        return thrusters;
    }


    public static class Builder {
        private String name; // mandatory
        private String destination; // mandatory
        private int duration; // mandatory
        private String spacecraft; // mandatory
        private TeamComposite missionTeam; // mandatory
        private boolean returnTrip = false; // optional
        private int thrusters = 1; // optional

        public Builder (String name, String destination, int duration, String spacecraft, TeamComposite missionTeam) {
            this.name = name;
            this.destination = destination;
            this.duration = duration;
            this.spacecraft = spacecraft;
            this.missionTeam = missionTeam;
        }

        public Builder addReturnTrip() {
            returnTrip = true;
            return this;
        }

        public Builder addThrusters(int n) {
            thrusters += n;
            return this;
        }

        public MissionDetails build() {
            return new MissionDetails(this);
        }

    }


    @Override
    public String toString() {
        return "MissionDetails [name=" + name + ", destination=" + destination + ", duration=" + duration
                + ", spacecraft=" + spacecraft + ", missionTeam=" + missionTeam.getName() + ", returnTrip=" + returnTrip
                + ", thrusters=" + thrusters + "]";
    }



    

}
