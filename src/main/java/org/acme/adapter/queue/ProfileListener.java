package org.acme.adapter.queue;

import org.acme.profile.Profile;
import org.acme.profile.ProfileUpdater;

public class ProfileListener {

    ProfileUpdater profileUpdater;

    void listen(Profile profile) {
        profileUpdater.save(profile);
    }

}
