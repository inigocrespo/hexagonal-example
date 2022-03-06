package org.acme.adapter.controller;

import java.util.List;
import org.acme.profile.Profile;
import org.acme.profile.ProfileFinder;

public class ProfileController {

    ProfileFinder profileFinder;

    Profile findOne(String id) {
        return profileFinder.findOne(id);
    }

    List<Profile> findAll() {
       return profileFinder.findAll();
    }

}
