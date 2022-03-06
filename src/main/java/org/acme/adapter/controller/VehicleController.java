package org.acme.adapter.controller;

import java.util.List;
import org.acme.VehicleService;
import org.acme.Vehicle;

public class VehicleController {

    VehicleService vehicleService;

    Vehicle findOne(String id) {
        return vehicleService.find0ne(id);
    }

    List<Vehicle> findAll() {
        return vehicleService.findAll();
    }

}
