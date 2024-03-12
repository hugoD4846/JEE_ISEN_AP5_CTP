package lab07.core.entity;


import jakarta.persistence.*;

import java.util.List;

public class Type extends GenericEntity{
    private String name;
    private int weight;

    public Type(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Type() {
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
    private List<Grade> grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
