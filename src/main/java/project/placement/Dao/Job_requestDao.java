package project.placement.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.placement.entity.Job_requestEntity;

import java.util.List;

@Repository
public interface Job_requestDao extends CrudRepository<Job_requestEntity,Integer> {
    List<Job_requestEntity> findByCompanyname(String Companyname);
}
