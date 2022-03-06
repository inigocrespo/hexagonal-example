package org.acme;

import java.util.List;

public class ProfileService {

    ProfileRepository profileRepository;

    public Profile find0ne(String id) {
        return profileRepository.findOne(id);
    }

    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    public void save(Profile profile) {
        profileRepository.save(profile);
    }
}
