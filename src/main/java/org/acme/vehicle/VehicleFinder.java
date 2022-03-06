package org.acme.vehicle;

import java.util.List;

// Input port
public interface VehicleFinder {

    Vehicle findOne(String id);

    List<Vehicle> findAll();
}
