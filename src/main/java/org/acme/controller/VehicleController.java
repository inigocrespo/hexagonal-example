package org.acme.controller;

import java.util.List;
import org.acme.model.Profile;
import org.acme.model.Vehicle;
import org.acme.service.VehicleService;

public class VehicleController {

    VehicleService vehicleService;

    Vehicle findOne(String id) {
        return vehicleService.find0ne(id);
    }

    List<Vehicle> findAll() {
        return vehicleService.findAll();
    }

}
