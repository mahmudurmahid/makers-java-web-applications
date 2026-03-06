package com.makers.makersbnb.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "SPACES")
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String rules;
    public Space() {}

    public Space(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRules() {
        return this.rules = rules;
    }
    public void setRules() {
        this.rules = rules;
    }
}
