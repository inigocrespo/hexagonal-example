package org.acme.profile.impl;

import java.util.List;
import org.acme.profile.Profile;
import org.acme.profile.ProfileFinder;
import org.acme.profile.ProfileRepository;
import org.acme.profile.ProfileUpdater;

public class ProfileServiceImpl implements ProfileUpdater, ProfileFinder {

    ProfileRepository profileRepository;

    @Override
    public Profile findOne(String id) {
        return profileRepository.findOne(id);
    }

    @Override
    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    @Override
    public void save(Profile profile) {
        profileRepository.save(profile);
    }
}
