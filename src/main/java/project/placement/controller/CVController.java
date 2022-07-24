package project.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import project.placement.model.CV;
import project.placement.service.CVService;

@Controller
public class CVController {
    @Autowired
    private CVService cvService;

    @ResponseBody
    @RequestMapping(value = "/cv",method = RequestMethod.POST)
    public String insertCV(@RequestBody CV cv){
        cvService.insertCV(cv);
        return "true";
    }
}
