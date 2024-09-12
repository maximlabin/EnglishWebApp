package org.example.english.controller;

import lombok.Getter;
import org.example.english.entity.Student;
import org.example.english.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class HomeController {
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    private StudentService studentService;

    public HomeController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path="/")
    public String homePage() {
        return "Hello World";
    }

    @GetMapping(path="/login", produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String login() {
        return "login";
    }

    @GetMapping(path="/lessons")
    public String lessons() {
        return "lessons";
    }

    @GetMapping(path="/students")
    public List<Student> student() {
        return studentService.getStudents();
    }

    @GetMapping(path="/dictionary", produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String dictionary() {
        return "dictionary";
    }
}
