package org.example.lessonspringcore.springCore;


import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
public class Student {
    private int id;
    private String group;
    private  String name;

}
