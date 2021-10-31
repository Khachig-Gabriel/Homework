package cars;
/*
Task 1 - Cars
 */
public class Car {

    public String manufacturer;
    public String model;
    public String engine;
    public int horsepower;
    public String gearBox;
    public int productionYear;
    public double acceleration0to60Mph;

    public void run() {
        System.out.println("The car is running");
    }
    public void printManufacturer() {
        System.out.println("The manufacturer is: " + manufacturer);
    }
    public void printModel() {
        System.out.println("The model is: " + model);
    }
    public void printEngine() {
        System.out.println("The car engine is: " + engine);
    }
    public void printHorsepower() {
        System.out.println("The car has " + horsepower + " hp");
    }
    public void printGearbox() {
        System.out.println("The gearbox is: " + gearBox);
    }
    public void printProductionYear() {
        System.out.println("The production year: " + productionYear);
    }
    public void printAcceleration() {
        System.out.println("The acceleration from 0 to 60 mph is: " + acceleration0to60Mph + "s");
    }




}
