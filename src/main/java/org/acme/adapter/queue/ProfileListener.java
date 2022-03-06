package org.acme.adapter.queue;

import org.acme.Profile;
import org.acme.ProfileService;

public class ProfileListener {

    ProfileService profileService;

    void listen(Profile profile) {
        profileService.save(profile);
    }

}
