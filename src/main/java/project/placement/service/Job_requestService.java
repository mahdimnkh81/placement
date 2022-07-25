package project.placement.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.placement.Dao.Job_requestDao;
import project.placement.entity.Job_requestEntity;
import project.placement.model.JobRequest;

@Service
public class Job_requestService {
    @Autowired
    private Job_requestDao job_requestDao;
    @Autowired
    private ModelMapper modelMapper;

    public String insert_Job_request(JobRequest job_request){
//        Job_requestEntity job_requestEntity=new Job_requestEntity();
//        job_requestEntity.setCompanyname(job_request.getCompanyname());
//        job_requestEntity.setJobcategory(job_request.getJobcategory());
//        job_requestEntity.setJobdescription(job_request.getJobdescription());
        job_requestDao.save(modelMapper.map(job_request,Job_requestEntity.class));
//        job_requestDao.save(job_requestEntity);
        return "true";
    }
    public ResponseEntity search_job(String companyName){
        return ResponseEntity.ok(job_requestDao.findByCompanyname(companyName));
    }

}
