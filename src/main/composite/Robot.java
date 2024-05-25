package main.composite;

public class Robot implements EntityElement {
    private String name;
    private String role;
    private String model;

    public Robot(String name, String role, String model) {
        this.name = name;
        this.role = role;
        this.model = model;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void displayDetails() {
        System.out.println(model + " " + role + " Robot \"" + name + "\"");
    }

    @Override
    public int getSize() {
        return 1;
    }
}
