package project.placement.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "Job_requests")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Job_requestEntity {
    @Id
    private Integer id;
    private String companyname;
    private String Jobcategory;
    private String Jobdescription;
    private String Conditionsandbenefits;
    @ManyToOne
    private UserEntity userEntity;

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getJobcategory() {
        return Jobcategory;
    }

    public void setJobcategory(String jobcategory) {
        Jobcategory = jobcategory;
    }

    public String getJobdescription() {
        return Jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        Jobdescription = jobdescription;
    }

    public String getConditionsandbenefits() {
        return Conditionsandbenefits;
    }

    public void setConditionsandbenefits(String conditionsandbenefits) {
        Conditionsandbenefits = conditionsandbenefits;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
