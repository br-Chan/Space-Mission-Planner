package main.mission;

import main.Prototype;

public class MarsMission extends Mission implements Prototype {

    @Override
    public String getDetails() {
        return "Mars Mission";
    }

    @Override
    public Prototype clone() {
        return new MarsMission();
    }

}
