package home.project.Web.model;

import org.springframework.data.annotation.Id;


public class Student {

    @Id
    private String uuid;
    private String name;
    private int age;



    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }



    public String getUuid() {
        return uuid;
    }

    private void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
