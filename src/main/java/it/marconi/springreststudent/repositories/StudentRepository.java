package it.marconi.springreststudent.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import it.marconi.springreststudent.domains.Student;

public interface StudentRepository extends JpaRepository<Student, UUID> {
    
}
