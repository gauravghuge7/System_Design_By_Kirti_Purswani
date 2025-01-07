

import Vehicle.Vehicle;
import VehicleType.Car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         *  create the Scanner class for the accepting inputs
         */
        Scanner scan = new Scanner(System.in);

        String vehicleType = scan.nextLine();

        Vehicle vehicle = null;

        if(vehicleType.equals("car")) {
            vehicle = new Car();
        }
        else if (vehicleType == "bike") {
//            vehicle = new Bike();
        }

        vehicle.createVehicle();


    }
}