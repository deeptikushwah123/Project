package com.springbootproject.services;

import com.springbootproject.model.Employee;
import com.springbootproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public class EmployeeServicesiml implements EmployeeServices{

    @Autowired
    String name;
    public static void main(String[] args) {
        int a;
        System.out.println();
    }

    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmploye() {
        return employeeRepository.findAll() ;
    }
}
