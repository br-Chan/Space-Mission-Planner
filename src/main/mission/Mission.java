package main.mission;

import main.Prototype;

public abstract class Mission implements Prototype {

    public abstract String getDetails();

    public abstract Prototype copy();

}
