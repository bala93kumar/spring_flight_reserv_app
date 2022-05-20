package com.balakumar.spring_flight_reserv_app.controller;


import com.balakumar.spring_flight_reserv_app.entities.User;
import com.balakumar.spring_flight_reserv_app.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserControllers {

    @Autowired
    UserRepo userRepo;

    @RequestMapping("/ShowReg")
    public String showRegistration() {

        return "login/registerUser";
    }

    @RequestMapping(value = "/registration" ,method=RequestMethod.POST )
    public String registerUser(@ModelAttribute("user") User user){

        userRepo.save(user);

        return "login/login";

    }

    @RequestMapping( "/login")
    public String login(@RequestParam("email") String email , @RequestParam("password") String password, ModelMap modelmap){

        User user_obj = userRepo.findByEmail(email);

        if (user_obj.getPassword().equals(password)) {
            return "flights/findFlights";
        } else {

            modelmap.addAttribute("msg", "Incorrect user name or password");
        }

        return "login/login";
    }


}
