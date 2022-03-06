package org.acme.impl;

import java.util.List;
import org.acme.Profile;
import org.acme.ProfileFinder;
import org.acme.ProfileRepository;
import org.acme.ProfileUpdater;

public class ProfileServiceImpl implements ProfileFinder, ProfileUpdater {

    ProfileRepository profileRepository;

    @Override
    public Profile find0ne(String id) {
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
