package home.project.Web.services;


import home.project.Web.dao.StudentDAO;
import home.project.Web.model.Student;
import home.project.Web.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class StudentServicesImpl implements StudentServices{

    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
//    public StudentServices(StudentRepository studentRepository){
//        this.studentRepository = studentRepository;
//    }

    public List<Student> getAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        studentList.stream()
                .forEach(student -> {
                    System.out.println(student.getName());
                });
        return studentRepository.findAll();
    }

    public void insertListOfStudent(){
        String name = "Nhu";
        for (int i=0 ; i< 50; i++){
            String va = String.valueOf(i);
            String tempName = name + va;
            Student student = new Student(tempName, 23);
            studentRepository.save(student);
        }
    }

    public Student insertStudent(Student student){
        studentRepository.save(student);
        return null;
    }

}
