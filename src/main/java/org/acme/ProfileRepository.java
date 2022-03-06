package org.acme;

import java.util.List;

// Output port
public interface ProfileRepository {

    Profile findOne(String id);

    List<Profile> findAll();

    void save(Profile profile);

}
