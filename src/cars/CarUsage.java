package cars;
/*
Task 1 - Cars
 */
public class CarUsage {
    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        car.manufacturer = "Morgan Motor Company";
        car.model = "Aero8";
        car.engine = "4.8 L BMW N62 V8";
        car.horsepower = 376;
        car.gearBox = "6-speed automatic";
        car.productionYear = 2009;
        car.acceleration0to60Mph = 4.3;

        car1.manufacturer = "Jaguar";
        car1.model = "F-Type Project 7";
        car1.engine = "Supercharged 5.0 L V8";
        car1.horsepower = 567;
        car1.gearBox = "8-speed automatic";
        car1.productionYear = 2016;
        car1.acceleration0to60Mph = 3.8;

        car2.manufacturer = "Aston Martin";
        car2.model = "DB5 Vantage";
        car2.engine = "Straight-6, 4.0L";
        car2.horsepower = 325;
        car2.gearBox = "5-speed manual";
        car2.productionYear = 1964;
        car2.acceleration0to60Mph = 6.2;

        car3.manufacturer = "Tesla, Inc.";
        car3.model = "Model S Plaid ";
        car3.engine = "Electric";
        car3.horsepower = 1020;
        car3.gearBox = "Auto Shift";
        car3.productionYear = 2021;
        car3.acceleration0to60Mph = 2.0;

        car4.manufacturer = "Acura";
        car4.model = "TLX Type S";
        car4.engine = "3.0-liter V-6 ";
        car4.horsepower = 355;
        car4.gearBox = "10-speed automatic";
        car4.productionYear = 2021;
        car4.acceleration0to60Mph = 5.5;

        car.run();
        car.printManufacturer();
        car.printModel();
        car.printEngine();
        car.printHorsepower();
        car.printGearbox();
        car.printProductionYear();
        car.printAcceleration();
        System.out.println();

        car1.run();
        car1.printManufacturer();
        car1.printModel();
        car1.printEngine();
        car1.printHorsepower();
        car1.printGearbox();
        car1.printProductionYear();
        car1.printAcceleration();
        System.out.println();

        car2.run();
        car2.printManufacturer();
        car2.printModel();
        car2.printEngine();
        car2.printHorsepower();
        car2.printGearbox();
        car2.printProductionYear();
        car2.printAcceleration();
        System.out.println();

        car3.run();
        car3.printManufacturer();
        car3.printModel();
        car3.printEngine();
        car3.printHorsepower();
        car3.printGearbox();
        car3.printProductionYear();
        car3.printAcceleration();
        System.out.println();

        car4.run();
        car4.printManufacturer();
        car4.printModel();
        car4.printEngine();
        car4.printHorsepower();
        car4.printGearbox();
        car4.printProductionYear();
        car4.printAcceleration();
    }
}
