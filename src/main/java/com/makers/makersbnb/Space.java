package com.makers.makersbnb;

import jakarta.persistence.*;

@Entity
@Table(name = "SPACES")
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public Space() {}

    public Space(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
