package home.project.Web.dao;

import home.project.Web.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface StudentDAO{

//    List<Student> studentList = new ArrayList<>();
    public Student insertStudent();
//    public void deleteStudent(long uuid);
//    public Optional<Student> getSpecificStudent(long uuid);
    public List<Student> getAllStudents();


//    default Student addStudent(Student student){
//        UUID uuid = UUID.randomUUID();
//        return insertStudent(student);
//    }

}
