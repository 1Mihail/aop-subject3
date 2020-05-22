package com.aop.ex3.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * This entity creates a remember_table
 * http://localhost:8080/h2-console
 * You can login in h2 using the application.properties credentials.
 * */
@Entity(name = "remember_table")
public class RememberTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String result;

    public RememberTable() {
    }

    public RememberTable(String result) {
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public String getResult() {
        return result;
    }
}
