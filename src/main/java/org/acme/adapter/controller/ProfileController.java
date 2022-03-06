package org.acme.adapter.controller;

import java.util.List;
import org.acme.ProfileService;
import org.acme.Profile;

public class ProfileController {

    ProfileService profileService;

    Profile findOne(String id) {
        return profileService.find0ne(id);
    }

    List<Profile> findAll() {
        return profileService.findAll();
    }

}
