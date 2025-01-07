import Vehicle.Vehicle;
import VehicleTypes.Car;

public class VehicleFactory {


    /**
     * NOTE Here is the logic of all classes
     * @param vehicleType
     * @return
     */
    public static Vehicle getVehicle(String vehicleType) {

        Vehicle vehicle = null;

        if(vehicleType == "car") {
            vehicle = new Car();
        }


        return vehicle;
    }

}
