package com.project.application;

import com.project.model.entities.Department;
import com.project.model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department department = new Department();
        department.setId(123456);
        department.setName("Books");

        Seller obj = new Seller(24, "Bob", "jeffmonteiro@icloud.com", new Date(), 7000.00, department);

        System.out.println("Esse é o id: " + department.getId() + " e esse é o nome do department: " + department.getName());
        System.out.println(obj);
    }
}