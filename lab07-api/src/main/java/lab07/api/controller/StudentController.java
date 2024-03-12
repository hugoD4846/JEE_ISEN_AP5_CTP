package lab07.api.controller;

import lab07.core.entity.Student;
import lab07.core.entity.Type;
import lab07.core.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students") //this is a hint
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> getAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable("id") long id) {
        return studentService.findById(id);
    }


}
