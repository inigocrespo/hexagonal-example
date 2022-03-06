package org.acme;

import java.util.List;

public class ProfileController {

    ProfileService profileService;

    Profile findOne(String id) {
        return profileService.find0ne(id);
    }

    List<Profile> findAll() {
        return profileService.findAll();
    }

}
