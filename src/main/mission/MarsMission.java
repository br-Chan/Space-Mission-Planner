package main.mission;

import main.Prototype;

public class MarsMission extends Mission {

    @Override
    public String getDetails() {
        return "Mars Mission";
    }

    @Override
    public Prototype copy() {
        return new MarsMission();
    }

}
