package lab07.core.entity;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Subject extends GenericEntity {

    private String name;

    private int weight;

    public Subject() {
    }

    public Subject(String name, int weight, List<Grade> grades) {
        this.name = name;
        this.weight = weight;
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
}
