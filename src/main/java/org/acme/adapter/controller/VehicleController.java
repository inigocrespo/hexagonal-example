package org.acme.adapter.controller;

import java.util.List;
import org.acme.vehicle.Vehicle;
import org.acme.vehicle.VehicleFinder;

public class VehicleController {

    VehicleFinder vehicleFinder;

    Vehicle findOne(String id) {
        return vehicleFinder.findOne(id);
    }

    List<Vehicle> findAll() {
        return vehicleFinder.findAll();
    }
}
