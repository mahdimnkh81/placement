package project.placement.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.placement.entity.CVEntity;


@Repository
public interface CVDao extends CrudRepository<CVEntity,Integer> {

}

