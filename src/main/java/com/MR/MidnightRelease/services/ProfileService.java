package com.MR.MidnightRelease.services;

import com.MR.MidnightRelease.data.Profile;
import com.MR.MidnightRelease.data.ProfileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    Logger logger = LoggerFactory.getLogger(ProfileService.class);

    ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }

    public Profile getProfile(String username){
        return profileRepository.findItemByUsername(username);
    }

    public List<Profile> getProfiles(){
        return profileRepository.findAll();
    }

    public void addProfile(Profile profile){
        if(profile == null){
            logger.error("Profile is null.");
            throw new RuntimeException("Profile cannot be null.");
        }
        this.profileRepository.save(profile);
    }

}
