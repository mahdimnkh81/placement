package project.placement.model;

import project.placement.enumm.Gender;
import project.placement.enumm.Role;

import java.time.LocalDate;

public class User {

    private Integer id;
    private Role role;
    private String fName;
    private String lName;
    private LocalDate Date_of_birth;
    private Gender gender;
    private String phone;
    private String email;
    private String home_address;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
