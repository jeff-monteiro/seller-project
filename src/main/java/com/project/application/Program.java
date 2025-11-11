package com.project.application;

import com.project.model.entities.Department;

public class Program {

    public static void main(String[] args) {

        Department department = new Department();
        department.setId(123456);
        department.setName("Books");

        System.out.println("Esse é o id: " + department.getId() + " e esse é o nome do department: " + department.getName());
    }
}