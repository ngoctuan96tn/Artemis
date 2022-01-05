package de.tum.in.www1.artemis.service;

import de.tum.in.www1.artemis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
}
