package main.composite;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class TeamComposite implements EntityElement {
    private String name;
    private Set<EntityElement> entitySet;

    public TeamComposite(String name) {
        this.name = name;
        entitySet = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addEntity(EntityElement entity) {
        entitySet.add(entity);
    }

    public void removeEntity(EntityElement entity) {
        entitySet.remove(entity);
    }

    public Set<EntityElement> getPeople() {
        Set<EntityElement> set = new HashSet<>();
        for (EntityElement entity : entitySet) {
            if (entity instanceof CrewMember || entity instanceof Robot) {
                set.add(entity);
            }
            else {
                set.addAll(((TeamComposite)entity).getPeople());
            }
        }

        return set;
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
        return getPeople().size();
    }
}
