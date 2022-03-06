package org.acme;

public class VehicleListener {

    VehicleService vehicleService;

    void listen(Vehicle vehicle) {
        vehicleService.save(vehicle);
    }

}
