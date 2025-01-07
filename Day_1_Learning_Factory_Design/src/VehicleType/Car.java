package VehicleType;

import Vehicle.Vehicle;

public class Car implements Vehicle {


    public Car() {
    }
    @Override
    public void createVehicle() {
        System.out.println("Creating Car");
    }
}
