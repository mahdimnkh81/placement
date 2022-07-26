package project.placement.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.placement.entity.EmployerResultsEntity;
@Repository
public interface EmployerResultsDao extends CrudRepository<EmployerResultsEntity,String> {
}
