package main.composite;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class TeamComposite implements EntityElement {
    private String name;
    private Set<EntityElement> entitySet;

    public TeamComposite(String name) {
        this.name = name;
        entitySet = new HashSet<>();
    }

    public void addEntity(EntityElement entity) {
        entitySet.add(entity);
    }

    public void removeEntity(EntityElement entity) {
        entitySet.remove(entity);
    }

    @Override
    public void displayDetails() {
        System.out.println(getSize() + "-entity Team: " + name);

        for (EntityElement entity : entitySet) {
            System.out.print(" - ");
            entity.displayDetails();
        }

    }

    @Override
    public int getSize() {
        int size = 0;

        for (EntityElement entity : entitySet) {
            size += entity.getSize();
        }

        return size;
    }
}
