package lab07.core.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Subject extends GenericEntity {

    private String name;

    private int weight;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Grade> grades;

    public Subject() {
    }

    public Subject(String name, int weight, List<Grade> grades) {
        this.name = name;
        this.weight = weight;
        this.grades = grades;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Grade> getGrades() {
        return this.grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

}
