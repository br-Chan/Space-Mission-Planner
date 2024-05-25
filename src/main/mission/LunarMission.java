package main.mission;

import main.Prototype;

public class LunarMission extends Mission {

    @Override
    public String getDetails() {
        return "Lunar Mission";
    }

    @Override
    public Prototype copy() {
        return new LunarMission();
    }

}
