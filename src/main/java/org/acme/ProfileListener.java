package org.acme;

public class ProfileListener {

    ProfileService profileService;

    void listen(Profile profile) {
        profileService.save(profile);
    }

}
