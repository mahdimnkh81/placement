package project.placement.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.placement.Dao.EmployerResultsDao;
import project.placement.entity.EmployerResultsEntity;
import project.placement.model.EmployerResults;

@Service
public class EmployerResultsService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private EmployerResultsDao employerResultsDao;

    public String create_employer_results(EmployerResults employerResults){
        employerResultsDao.save(modelMapper.map(employerResults, EmployerResultsEntity.class));
        return "true";
    }
}
