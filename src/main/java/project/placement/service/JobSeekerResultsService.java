package project.placement.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.placement.Dao.JobSeekerResultsDao;
import project.placement.entity.JobSeekerResultsEntity;
import project.placement.model.JobSeekerResults;

@Service
public class JobSeekerResultsService {
    @Autowired
    private JobSeekerResultsDao jobSeekerResultsDao;
    @Autowired
    private ModelMapper modelMapper;

    public String create_jobSeeker_results(JobSeekerResults jobSeekerResults){
        jobSeekerResultsDao.save(modelMapper.map(jobSeekerResults,JobSeekerResultsEntity.class));
        return "true";
    }

}
