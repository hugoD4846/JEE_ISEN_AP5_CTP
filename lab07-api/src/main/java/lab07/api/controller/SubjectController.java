package lab07.api.controller;

import lab07.core.entity.Subject;
import lab07.core.service.SubjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;

    }

    @GetMapping("/{id}")
    public Subject getById(@PathVariable long id) {
        return subjectService.findById(id);
    }


}
