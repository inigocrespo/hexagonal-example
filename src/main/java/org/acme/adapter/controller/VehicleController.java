package org.acme.adapter.controller;

import java.util.List;
import org.acme.Vehicle;
import org.acme.VehicleFinder;

public class VehicleController {

    VehicleFinder vehicleFinder;

    Vehicle findOne(String id) {
        return vehicleFinder.find0ne(id);
    }

    List<Vehicle> findAll() {
        return vehicleFinder.findAll();
    }

}
