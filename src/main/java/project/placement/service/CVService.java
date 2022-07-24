package project.placement.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import project.placement.Dao.CVDao;
import project.placement.entity.CVEntity;
import project.placement.Dao.CVDao;
import project.placement.model.CV;

@Service
public class CVService {
    @Autowired
    private CVDao cvDao;
    @Autowired
    private ModelMapper modelMapper;

    public String insertCV(CV cv){
        cvDao.save(modelMapper.map(cv, CVEntity.class));
        return "yes";
    }
}
