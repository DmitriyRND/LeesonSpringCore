package org.example.lessonspringcore.springCore.springCore2;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Auto {
    private int id;
    private Engine engine;
    private String model;

    public Auto(int id, Engine engine, String model) {
        this.id = id;
        this.engine = engine;
        this.model = model;

    }
}

