package project.placement.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.placement.entity.UserEntity;
@Repository
public interface UserDao extends CrudRepository<UserEntity,Integer> {

}
