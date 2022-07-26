package project.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import project.placement.model.JobSeekerResults;
import project.placement.service.JobSeekerResultsService;


@Controller
public class JobSeekerResultsController {
    @Autowired
    private JobSeekerResultsService jobSeekerResultsService;

    @ResponseBody
    @RequestMapping(value = "/JobSeekerResults",method = RequestMethod.POST)
    public String create_jobSeeker_results(@RequestBody JobSeekerResults jobSeekerResults){
        jobSeekerResultsService.create_jobSeeker_results(jobSeekerResults);
        return "true";
    }
}
