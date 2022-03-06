package org.acme;

import java.util.List;

public class VehicleController {

    VehicleService vehicleService;

    Vehicle findOne(String id) {
        return vehicleService.find0ne(id);
    }

    List<Vehicle> findAll() {
        return vehicleService.findAll();
    }

}
