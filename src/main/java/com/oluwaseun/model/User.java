package com.oluwaseun.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {


    // id,name,dept,salary
    @Id
    private Integer id;
    private String name;
    private String department;
    private Integer salary;

    public User() {
    }

    public User(Integer id, String name, String department, Integer salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
