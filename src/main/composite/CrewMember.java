package main.composite;

public class CrewMember implements EntityElement {
    private String name;
    private String role;
    private int rank;

    public CrewMember(String name, String role, int rank) {
        this.name = name;
        this.role = role;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rank #" + rank + " " + role + " " + name);
    }

    @Override
    public int getSize() {
        return 1;
    }

}
