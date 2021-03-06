package org.acme.vehicle;

import java.util.List;

// Output port
public interface VehicleRepository {

    Vehicle findOne(String id);

    List<Vehicle> findAll();

    void save(Vehicle vehicle);
}
