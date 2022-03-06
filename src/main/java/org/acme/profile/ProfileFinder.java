package org.acme.profile;

import java.util.List;

// Input port
public interface ProfileFinder {

    Profile findOne(String id);

    List<Profile> findAll();
}
