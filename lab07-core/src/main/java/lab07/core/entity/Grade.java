package lab07.core.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
@JsonIgnoreProperties({ "student" }) // leave it like this, it will help the JSON serialization
public class Grade extends GenericEntity {

  private LocalDate date;

  private int grade;

  @ManyToOne
  private Student student;

  @ManyToOne
  private Subject subject;

  @ManyToOne
  private Type type;

  public Grade() {
  }

  public Grade(Student student, Subject subject, LocalDate date, Type type, int grade) {
    this.date = date;
    this.grade = grade;
    this.student = student;
    this.subject = subject;
    this.type = type;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public int getGrade() {
    return this.grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public Student getStudent() {
    return this.student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Subject getSubject() {
    return this.subject;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  public Type getType() {
    return this.type;
  }

  public void setType(Type type) {
    this.type = type;
  }

}
