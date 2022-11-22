package com.MR.MidnightRelease.services;

import com.MR.MidnightRelease.data.Login;
import com.MR.MidnightRelease.data.LoginRepository;
import com.MR.MidnightRelease.data.Profile;
import com.MR.MidnightRelease.data.ProfileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    Logger logger = LoggerFactory.getLogger(LoginService.class);

    LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    public Login getLogin(String username){
        return loginRepository.findItemByUsername(username);
    }

    public List<Profile> getProfiles(){
        return loginRepository.findAll();
    }

    public void addProfile(Profile profile){
        if(profile == null){
            logger.error("Profile is null.");
            throw new RuntimeException("Profile cannot be null.");
        }
        this.loginRepository.save(profile);
    }

}
