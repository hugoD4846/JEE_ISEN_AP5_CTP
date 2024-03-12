package lab07.core.entity;

import jakarta.persistence.*;

import java.util.List;

public class Student extends GenericEntity {
    public Student(String firstname, String lastname, String email) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    private String email;
    private String firstname;
    private String lastname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Grade> grades;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
