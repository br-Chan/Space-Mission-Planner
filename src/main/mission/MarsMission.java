package main.mission;

import main.Prototype;
import main.missiondetails.MissionDetails;

public class MarsMission extends Mission {
    private int rocksSampled;

    public MarsMission(MissionDetails missionDetails) {
        super(missionDetails);
        rocksSampled = 0;
    }

    public int getRocksSampled() {
        return rocksSampled;
    }

    public void logRockSample() {
        rocksSampled++;
    }

    @Override
    public String getDetails() {
        return "Mars Mission";
    }

    @Override
    public Prototype copy() {
        return new MarsMission(missionDetails);
    }

}
