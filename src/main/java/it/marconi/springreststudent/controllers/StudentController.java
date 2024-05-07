package it.marconi.springreststudent.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.marconi.springreststudent.domains.Student;
import it.marconi.springreststudent.services.StudentService;

@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student s) {
        
        return studentService.save(s);
    }

    @GetMapping("/getstudent")
    public Student getsStudent(@RequestParam String cognome) {

        Optional<Student> opt = studentService.get(cognome);

        if (opt.isPresent())
            return opt.get();
        else
            return new Student();
    }
}
