package home.project.Web.controller;

import home.project.Web.model.Student;
import home.project.Web.services.StudentServices;
import home.project.Web.services.StudentServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentServices studentServices;

    @Autowired
    public StudentController(StudentServicesImpl studentServicesImpl){
        this.studentServices = studentServicesImpl;
    }


    @GetMapping("")
    public List<Student> getStudents(){
        return studentServices.getAllStudent();
    }

    @PostMapping("/lists")
    public void addStudent(){
        studentServices.insertListOfStudent();
    }
}
