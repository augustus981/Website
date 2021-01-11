package home.project.Web.dao;

import home.project.Web.model.Student;
import home.project.Web.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


//@Repository
public class StudentDaoImpl implements StudentDAO{

//    private StudentRepository studentRepository;

    @Override
    public Student insertStudent() {
        String id = "12345";
        for (int i = 0; i < 5; i++){
            String name = "Nhu ";
            Student student = new Student(name+id.charAt(i), 23);
//            studentRepository.save(student);
        }
        return null;
    }
//
//    @Override
//    public void deleteStudent(long uuid) {
//
//    }
//
//    @Override
//    public Optional<Student> getSpecificStudent(long uuid) {
//
//    }

    @Override
    public List<Student> getAllStudents() {
//        return (List<Student>) studentRepository.findAll();
        return null;
    }

//    @Override
//    public Student addStudent(Student student) {
//        return null;
//    }
}
