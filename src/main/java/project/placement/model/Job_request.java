package project.placement.model;

public class Job_request {

    private Integer id;
    private String companyname;
    private String Jobcategory;
    private String Jobdescription;
    private String Conditionsandbenefits;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
