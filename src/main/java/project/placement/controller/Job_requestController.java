package project.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.placement.model.JobRequest;
import project.placement.service.Job_requestService;

@Controller
public class Job_requestController {
    @Autowired
    private Job_requestService job_requestService;

    @ResponseBody
    @RequestMapping(value = "/JobRequest",method = RequestMethod.POST)
    public String insert_Job_request(@RequestBody JobRequest job_request){
//        System.out.println(job_request.getId());
//        System.out.println(job_request.getCompanyname());
//        System.out.println(job_request.getJobcategory());
//        System.out.println(job_request.getConditions());
        job_requestService.insert_Job_request(job_request);
        return "yes";
    }
//    @ResponseBody
//    @RequestMapping(value = "/JobSearch/{companyname}",method = RequestMethod.GET)
//    public String search_job(@PathVariable String companyname ){
//        System.out.println(companyname);
//        job_requestService.search_job(companyname);
//        return "yes";
//    }
}
