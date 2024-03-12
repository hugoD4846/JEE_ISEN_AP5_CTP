package lab07.core.service;

import jakarta.transaction.Transactional;
import lab07.core.dao.StudentDAO;
import lab07.core.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {

    private final StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void deleteAll() {
        studentDAO.deleteAll();
    }

    public Student findById(long studentId) {
        return studentDAO.findByIdWithGrades(studentId).orElse(null);
    }

    public List<Student> findAll() {
        return studentDAO.findAllWithGrades();
    }

    public void save(Student student) {
        studentDAO.save(student);
    }
}
