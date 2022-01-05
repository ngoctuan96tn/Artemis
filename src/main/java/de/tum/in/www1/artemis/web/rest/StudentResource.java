package de.tum.in.www1.artemis.web.rest;

import de.tum.in.www1.artemis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(SubmissionPolicyResource.ROOT)
public class StudentResource {
    @Autowired
    private StudentService studentService;
}
