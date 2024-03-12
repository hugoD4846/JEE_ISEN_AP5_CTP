package lab07.core.entity;


import jakarta.persistence.*;

import java.util.List;

public class Type extends GenericEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int weight;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
    private List<Grade> grades;

    @Override
    public long getId() {
        return id;
    }

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
