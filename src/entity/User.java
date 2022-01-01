package entity;

public class User {
    private int    id;
    private String name;
    private String lastName;
    private String birthDate;
    private String hireDate;
    private String salary;
    private String nationalId;
    private String workHour;
    private String title;

    public int getId() {
        return this.id;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }
}
