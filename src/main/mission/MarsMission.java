package main.mission;

import main.Prototype;
import main.missiondetails.MissionDetails;

public class MarsMission extends Mission {
    private int rocksSampled;
    // Could initialise an arraylist of rocks. Could create a Rock class.

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
    public Prototype copy() {
        return new MarsMission(missionDetails);
    }

}
