package org.acme;

import java.util.List;

// Input port
public interface VehicleFinder {

    Vehicle find0ne(String id);

    List<Vehicle> findAll();
}
