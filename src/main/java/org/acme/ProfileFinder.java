package org.acme;

import java.util.List;

public interface ProfileFinder {

    Profile find0ne(String id);

    List<Profile> findAll();
}
