package org.acme.service;

import java.util.List;
import org.acme.model.Profile;
import org.acme.model.Vehicle;
import org.acme.repository.VehicleRepository;

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
