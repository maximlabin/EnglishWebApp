package org.example.english.service;

import org.example.english.entity.Student;
import org.example.english.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }

}
