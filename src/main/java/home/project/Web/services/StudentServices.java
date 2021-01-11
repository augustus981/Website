package home.project.Web.services;

import home.project.Web.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentServices {

    public List<Student> getAllStudent();
    public void insertListOfStudent();
    public Student insertStudent(Student student);
}
