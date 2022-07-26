package project.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import project.placement.model.EmployerResults;
import project.placement.service.EmployerResultsService;

@Controller
public class EmployerResultsController {
    @Autowired
    private EmployerResultsService employerResultsService;
    @ResponseBody
    @RequestMapping(value = "/EmployerResults",method = RequestMethod.POST)
    public String create_employer_results(@RequestBody EmployerResults employerResults){
        employerResultsService.create_employer_results(employerResults);
        return "yes";
    }
}
