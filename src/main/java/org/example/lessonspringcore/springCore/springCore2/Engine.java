package org.example.lessonspringcore.springCore.springCore2;


import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component

public class Engine {
    private int id;
    private int power;

    public Engine(int id, int power) {
        this.id = id;
        this.power = power;
    }


}
