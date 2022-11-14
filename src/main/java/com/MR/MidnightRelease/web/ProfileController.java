package com.MR.MidnightRelease.web;
import com.MR.MidnightRelease.data.Profile;
import com.MR.MidnightRelease.services.ProfileService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService){
        this.profileService = profileService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getProfile(@RequestParam(value="username", required=true) String username, Model model){
        Profile profile = this.profileService.getProfile(username);
        model.addAttribute("profile", profile);
        return "main-profile";
    }
}
