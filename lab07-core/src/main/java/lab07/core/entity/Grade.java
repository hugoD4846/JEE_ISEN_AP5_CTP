package lab07.core.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@JsonIgnoreProperties({ "student" }) // leave it like this, it will help the JSON serialization
public class Grade extends GenericEntity {

  private LocalDate date;

  @Min(value = 0, message = "Grade must be at least 0, poor student...")
  @Max(value = 20, message = "Grade must be at most 20")
  private int grade;

  @ManyToOne
  @JoinColumn(name = "student_id", nullable = false)
  private Student student;

  @ManyToOne
  @JoinColumn(name = "subject_id", nullable = false)
  private Subject subject;

  @ManyToOne
  @JoinColumn(name = "type_id", nullable = false)
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
