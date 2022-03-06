package org.acme.adapter.queue;

import org.acme.Vehicle;
import org.acme.VehicleService;

public class VehicleListener {

    VehicleService vehicleService;

    void listen(Vehicle vehicle) {
        vehicleService.save(vehicle);
    }

}
