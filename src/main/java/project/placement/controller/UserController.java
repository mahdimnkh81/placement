package project.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import project.placement.model.User;
import project.placement.service.RegisterUserService;

@Controller
public class UserController {

    @Autowired
    private RegisterUserService registerUserService;

    @ResponseBody
    @RequestMapping(value = "/Register",method = RequestMethod.POST)
    public String register(@RequestBody User user){
        registerUserService.register(user);
        return "yes";
    }
}
