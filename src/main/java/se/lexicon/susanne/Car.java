package se.lexicon.susanne;

public class Car {
    private int id;
    private int year;
    private String model;
    private String colour;
    private int motorSize;

    public Car(int id, int year, String model, String colour, int motorSize) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.colour = colour;
        this.motorSize = motorSize;
    }

    public void drive(){
        System.out.println("Model: " + model + " with motor " + motorSize + "can drive now.");
    }
}
