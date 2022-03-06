package org.acme.vehicle.impl;

import java.util.List;
import org.acme.vehicle.Vehicle;
import org.acme.vehicle.VehicleFinder;
import org.acme.vehicle.VehicleRepository;
import org.acme.vehicle.VehicleUpdater;

public class VehicleServiceImpl implements VehicleFinder, VehicleUpdater {

    VehicleRepository vehicleRepository;

    @Override
    public Vehicle findOne(String id) {
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
