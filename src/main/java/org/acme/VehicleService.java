package org.acme;

import java.util.List;

public class VehicleService {

    VehicleRepository vehicleRepository;

    public Vehicle find0ne(String id) {
        return vehicleRepository.findOne(id);
    }

    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    public void save(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }
}
