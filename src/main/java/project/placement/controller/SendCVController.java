package project.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import project.placement.model.SendCV;
import project.placement.service.SendCvService;

@Controller
public class SendCVController {
    @Autowired
    private SendCvService sendEmailCvService;

    @ResponseBody
    @RequestMapping(value = "/SendCV",method = RequestMethod.POST)
    public String sendEmailCV(@RequestBody SendCV emailcv){
        sendEmailCvService.send_Email_Cv(emailcv);
        return "yes";
    }
}
