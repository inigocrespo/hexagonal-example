package org.acme.listener;

import org.acme.model.Profile;
import org.acme.service.ProfileService;

public class ProfileListener {

    ProfileService profileService;

    void listen(Profile profile) {
        profileService.save(profile);
    }

}
