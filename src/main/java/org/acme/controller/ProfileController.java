package org.acme.controller;

import java.util.List;
import org.acme.model.Profile;
import org.acme.service.ProfileService;

public class ProfileController {

    ProfileService profileService;

    Profile findOne(String id) {
        return profileService.find0ne(id);
    }

    List<Profile> findAll() {
        return profileService.findAll();
    }

}
