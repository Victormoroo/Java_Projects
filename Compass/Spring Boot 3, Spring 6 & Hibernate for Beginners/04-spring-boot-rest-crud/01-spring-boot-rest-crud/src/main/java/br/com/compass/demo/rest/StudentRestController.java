package br.com.compass.demo.rest;

import br.com.compass.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data... only once!
    @PostConstruct
    public void loadData() {

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Victor", "Moro"));
        theStudents.add(new Student("Lucas", "Silva"));
        theStudents.add(new Student("James", "Gun"));
    }

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    // define endpoint or "/students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // just index into the list... keep it simple for now

        // check the studentId again list size
        if((studentId >= theStudents.size()) || (studentId <= 0)) {
            throw new StudentNotFoundException("Student id not found: " + studentId);
        }

        return theStudents.get(studentId-1); // sem o -1 ele busca pelo index, e colocando -1 fica como se fosse uma busca por id mesmo
    }

    // Add an exception handler using @ExceptionHandler
    // aqui tinha o codigo que esta dentro de StudentRestExceptionHandler.java
}
