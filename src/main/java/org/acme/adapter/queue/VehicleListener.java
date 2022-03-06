package org.acme.adapter.queue;

import org.acme.vehicle.Vehicle;
import org.acme.vehicle.VehicleUpdater;

public class VehicleListener {

    VehicleUpdater vehicleUpdater;

    void listen(Vehicle vehicle) {
        vehicleUpdater.save(vehicle);
    }

}
