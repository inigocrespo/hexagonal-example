package org.acme.adapter.queue;

import org.acme.Vehicle;
import org.acme.VehicleUpdater;

public class VehicleListener {

    VehicleUpdater vehicleUpdater;

    void listen(Vehicle vehicle) {
        vehicleUpdater.save(vehicle);
    }

}
