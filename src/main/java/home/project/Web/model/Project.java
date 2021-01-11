package home.project.Web.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.annotation.Id;

public class Project {

    @Id
    private String uuid;
    private String name;
    private String description;


    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project(){

    }
}
