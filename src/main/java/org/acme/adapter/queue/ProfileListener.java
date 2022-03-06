package org.acme.adapter.queue;

import org.acme.Profile;
import org.acme.ProfileUpdater;

public class ProfileListener {

    ProfileUpdater profileUpdater;

    void listen(Profile profile) {
        profileUpdater.save(profile);
    }

}
