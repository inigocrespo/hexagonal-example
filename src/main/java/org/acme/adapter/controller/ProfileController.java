package org.acme.adapter.controller;

import java.util.List;
import org.acme.Profile;
import org.acme.ProfileFinder;

public class ProfileController {

    ProfileFinder profileFinder;

    Profile findOne(String id) {
        return profileFinder.find0ne(id);
    }

    List<Profile> findAll() {
        return profileFinder.findAll();
    }

}
