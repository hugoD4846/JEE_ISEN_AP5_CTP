package lab07.api.controller;

import lab07.core.entity.Grade;
import lab07.core.service.GradeService;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/grades")
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;

    }

    @GetMapping("/{gradeId}")
    public Grade findById(@PathVariable("gradeId") long gradeId) {
        return gradeService.findById(gradeId);
    }

    @PostMapping("/{gradeId}")
    public Grade update(@Valid @RequestBody Grade grade, BindingResult result) {
        // TODO Maybe change the response request in order to tell the user what he is
        // doing wrong when he make a BAD REQUEST (@Valid grade)
        gradeService.update(grade);
        return gradeService.findById(grade.getId());
    }

    @PostMapping("/")
    public Grade save(@Valid @RequestBody Grade grade, @RequestParam("studentId") long studentId,
            @RequestParam("subjectId") long subjectId) {
        gradeService.save(grade, studentId, subjectId);
        return gradeService.findById(grade.getId());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long gradeId) {
        gradeService.deleteGrade(gradeId);
    }

}
