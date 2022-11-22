package com.MR.MidnightRelease.web;
import com.MR.MidnightRelease.data.Login;
import com.MR.MidnightRelease.data.Profile;
import com.MR.MidnightRelease.services.LoginService;
import com.MR.MidnightRelease.services.ProfileService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @GetMapping("/createProfile")
    public String createProfile(Model model){
        model.addAttribute("profile", new Login());
        return "create-profile";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("login", new Login());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute Login login, Model model){
        Login account = loginService.getLogin(login.getUsername());
        if(account == null){
            model.addAttribute("fault", "Account Does Not Exist!");
            return "login";
        }else if(login.getPassword().equals(account.getPassword())){
            model.addAttribute("login", account);
            return "feed";
        }else{
            model.addAttribute("fault", "Password Incorrect");
            return "login";
        }
    }

    @PostMapping("/profile")
    public String profileSubmit(@ModelAttribute Profile profile, Model model){
        loginService.addProfile(profile);
        model.addAttribute("profile", profile);
        return "profiles";
    }


}
