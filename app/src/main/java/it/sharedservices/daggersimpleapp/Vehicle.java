package it.sharedservices.daggersimpleapp;

public class Vehicle {
    private String name;

    public Vehicle(String pName) {
        name = pName;
    }

    public String name() {
        return "my vehicle is " + name;
    }
}
