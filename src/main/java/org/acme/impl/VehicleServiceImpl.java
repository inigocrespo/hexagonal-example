package org.acme.impl;

import java.util.List;
import org.acme.Vehicle;
import org.acme.VehicleFinder;
import org.acme.VehicleRepository;
import org.acme.VehicleUpdater;

public class VehicleServiceImpl implements VehicleFinder, VehicleUpdater {

    VehicleRepository vehicleRepository;

    @Override
    public Vehicle find0ne(String id) {
        return vehicleRepository.findOne(id);
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public void save(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

}
