package com.MR.MidnightRelease.services;

import com.MR.MidnightRelease.data.Profile;
import com.MR.MidnightRelease.data.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }

    public Profile getProfile(String username){
        return profileRepository.findItemByUsername(username);
    }

    public void addProfile(Profile profile){
        if(profile == null){
            throw new RuntimeException("Profile cannot be null.");
        }
        this.profileRepository.save(profile);
    }

}
