package project.placement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployerResults")
public class EmployerResultsEntity {

    @Id
    private String name_company;
    private String title_job;
    private String descriptions;
    private String namejobseeker;
    private String email;

    public String getNamejobseeker() {
        return namejobseeker;
    }

    public void setNamejobseeker(String namejobseeker) {
        this.namejobseeker = namejobseeker;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName_company() {
        return name_company;
    }

    public void setName_company(String name_company) {
        this.name_company = name_company;
    }

    public String getTitle_job() {
        return title_job;
    }

    public void setTitle_job(String title_job) {
        this.title_job = title_job;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getNamejonseeker() {
        return namejobseeker;
    }

    public void setNamejonseeker(String namejonseeker) {
        this.namejobseeker = namejonseeker;
    }
}
