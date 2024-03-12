package lab07.api.controller;

import lab07.core.entity.Grade;
import lab07.core.service.GradeService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grades")
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;

    }

    // TODO expose the correct APIs

    @GetMapping("/{gradeId}")
    public Grade findById(@PathVariable("gradeId") long gradeId) {
        return gradeService.findById(gradeId);
    }

    @PostMapping("/{gradeId}")
    public Grade update(@RequestBody Grade grade) {
        gradeService.update(grade);
        return gradeService.findById(grade.getId());
    }

    @PostMapping("")
    public Grade save(@RequestBody Grade grade, @RequestParam("studentId") long studentId, @RequestParam("subjectId") long subjectId) {
        gradeService.save(grade, studentId, subjectId);
        return gradeService.findById(grade.getId());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")long gradeId) {
        gradeService.deleteGrade(gradeId);
    }

}
