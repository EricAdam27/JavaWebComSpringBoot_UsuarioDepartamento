package com.devsuperior.userdept.entities;

import javax.persistence.*;

@Entity
@Table(name = "TB_DEPARTMENT")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
