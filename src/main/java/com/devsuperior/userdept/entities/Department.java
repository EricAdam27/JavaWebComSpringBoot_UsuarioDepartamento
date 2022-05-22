package com.devsuperior.userdept.entities;

public class Department {

    private Long id;
    private String name;

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
