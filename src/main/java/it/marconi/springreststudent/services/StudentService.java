package it.marconi.springreststudent.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marconi.springreststudent.domains.Student;
import it.marconi.springreststudent.repositories.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepo;

    public Student save(Student s) {
        return studentRepo.save(s);
    }

    public Optional<Student> get(String cognome) {

        for (Student s : studentRepo.findAll())
            if (s.getCognome().equals(cognome))
                return Optional.of(s);

        return Optional.empty();
    }
}
