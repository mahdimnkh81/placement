package project.placement.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.placement.Dao.UserDao;
import project.placement.entity.UserEntity;
import project.placement.model.User;

@Service
public class RegisterUserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private ModelMapper modelMapper;

    public String register(User user){
        userDao.save(modelMapper.map(user,UserEntity.class));
        return "true";
    }
}
