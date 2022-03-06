package org.acme.profile;

import java.util.List;

// Output port
public interface ProfileRepository {

    Profile findOne(String id);

    List<Profile> findAll();

    void save(Profile profile);
}
