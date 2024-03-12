package lab07.api.controller;

import lab07.core.entity.Grade;
import lab07.core.service.GradeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grades")
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;

    }

    // TODO expose the correct APIs

    @GetMapping("/{gradeId}")
    public Grade findById(@PathVariable long gradeId) {
        return gradeService.findById(gradeId);
    }

    @PostMapping("/{gradeId}")
    public Grade update(@RequestBody Grade grade) {
        gradeService.update(grade);
        return gradeService.findById(grade.getId());
    }

    @PostMapping("")
    public Grade save(@RequestBody Grade grade) {
        save(grade);
        return gradeService.findById(grade.getId());
    }

    public void delete(@PathVariable long gradeId) {
        gradeService.deleteGrade(gradeId);
    }

}
