package project.placement.Dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.placement.entity.JobSeekerResultsEntity;


@Repository
public interface JobSeekerResultsDao extends CrudRepository<JobSeekerResultsEntity,String> {

}
