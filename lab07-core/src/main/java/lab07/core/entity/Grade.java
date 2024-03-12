package lab07.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.sql.Date;

@Entity
@JsonIgnoreProperties({ "student" }) // leave it like this, it will help the JSON serialization
public class Grade extends GenericEntity {

  private Date date;

  private int grade;

  @ManyToOne
  private Student student;

  @ManyToOne
  private Subject subject;

  @ManyToOne
  private Type type;

  public Grade() {
  }

  public Grade(Date date, int grade, Student student, Subject subject, Type type) {
    this.date = date;
    this.grade = grade;
    this.student = student;
    this.subject = subject;
    this.type = type;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
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
