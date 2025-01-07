package VehicleType;

import Vehicle.Vehicle;

class Bike implements Vehicle {

    public Bike() {
    }
    @Override
    public void createVehicle() {
        System.out.println("Creating Bike");
    }
}
