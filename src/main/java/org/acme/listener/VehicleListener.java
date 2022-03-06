package org.acme.listener;

import org.acme.model.Vehicle;
import org.acme.service.VehicleService;

public class VehicleListener {

    VehicleService vehicleService;

    void listen(Vehicle vehicle) {
        vehicleService.save(vehicle);
    }

}
