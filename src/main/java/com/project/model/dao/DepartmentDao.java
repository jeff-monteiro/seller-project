package com.project.model.dao;

import com.project.model.entities.Department;
import com.project.model.entities.Seller;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
