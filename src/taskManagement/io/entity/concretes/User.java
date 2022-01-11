package taskManagement.io.entity.concretes;

import java.util.Collection;
import lombok.Data;

@Data
public class User {
    private int                   id;
    private String                name;
    private String                lastName;
    private String                username;
    private String                birthDate;
    private String                hireDate;
    private String                salary;
    private String                nationalId;
    private String                workHour;
    private String           token;
    private Collection<Role> roles;

    public User() {
        System.out.println("user model worked");
    }

    public User(final int id, final String name, final String lastName, final String username, final String birthDate, final String hireDate, final String salary, final String nationalId, final String workHour, final Collection<Role> roles) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.salary = salary;
        this.nationalId = nationalId;
        this.workHour = workHour;
        this.roles = roles;
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public Collection<Role> getRoles() {
        return this.roles;
    }

    public void setRoles(final Collection<Role> roles) {
        this.roles = roles;
    }

    public void setId(final int id) {
        this.id = id;
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

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(final String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(final String hireDate) {
        this.hireDate = hireDate;
    }

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(final String salary) {
        this.salary = salary;
    }

    public String getNationalId() {
        return this.nationalId;
    }

    public void setNationalId(final String nationalId) {
        this.nationalId = nationalId;
    }

    public String getWorkHour() {
        return this.workHour;
    }

    public void setWorkHour(final String workHour) {
        this.workHour = workHour;
    }


}
