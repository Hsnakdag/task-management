package taskManagement.io.entity.concretes.dto;

import java.util.Date;

public class RegisterFormInfo {
    String username;
    String name;
    String lastName;
    String password;
    String email;
    String nationalID;
    Boolean isManager;
    Date birthdate;

    public RegisterFormInfo(final String username, final String name, final String lastName, final String password, final String email, final String nationalID, final Boolean isManager, final Date birthdate) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.nationalID = nationalID;
        this.isManager = isManager;
        this.birthdate = birthdate;
    }

    public RegisterFormInfo() {
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getNationalID() {
        return this.nationalID;
    }

    public void setNationalID(final String nationalID) {
        this.nationalID = nationalID;
    }

    public Boolean getManager() {
        return this.isManager;
    }

    public void setManager(final Boolean manager) {
        this.isManager = manager;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(final Date birthdate) {
        this.birthdate = birthdate;
    }

}
