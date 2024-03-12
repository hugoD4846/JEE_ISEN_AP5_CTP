package lab07.core.dao;

import lab07.core.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudentDAO extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s LEFT JOIN FETCH s.grades g LEFT JOIN FETCH g.subject LEFT JOIN FETCH g.type")
    List<Student> findAllWithGrades();

    @Query("SELECT s FROM Student s LEFT JOIN FETCH s.grades g LEFT JOIN FETCH g.subject LEFT JOIN FETCH g.type WHERE s.id = :studentId")
    Optional<Student> findByIdWithGrades(@Param("studentId")long studentId);

}
