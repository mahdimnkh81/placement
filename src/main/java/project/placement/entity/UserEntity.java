package project.placement.entity;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import project.placement.enumm.Gender;
import project.placement.enumm.Role;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "users")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String fName;
    private String lName;
    private LocalDate Date_of_birth;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String phone;
    @Email
    private String email;
    private String home_address;
    @OneToOne(mappedBy = "userEntity")
    private CVEntity cvEntity;

    @OneToMany(mappedBy = "userEntity")
    private List<Job_requestEntity> job_requestEntity;
    
    private String password;
    private String Repeat_password;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List<Job_requestEntity> getJob_requestEntity() {
        return job_requestEntity;
    }

    public void setJob_requestEntity(List<Job_requestEntity> job_requestEntity) {
        this.job_requestEntity = job_requestEntity;
    }

    public LocalDate getDate_of_birth() {
        return Date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        Date_of_birth = date_of_birth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHome_address() {
        return home_address;
    }

    public void setHome_address(String home_address) {
        this.home_address = home_address;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeat_password() {
        return Repeat_password;
    }

    public void setRepeat_password(String repeat_password) {
        Repeat_password = repeat_password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CVEntity getCvEntity() {
        return cvEntity;
    }

    public void setCvEntity(CVEntity cvEntity) {
        this.cvEntity = cvEntity;
    }
}
