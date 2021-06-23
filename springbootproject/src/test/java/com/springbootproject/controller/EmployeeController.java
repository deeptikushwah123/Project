package com.springbootproject.controller;

import com.springbootproject.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    //display lis of employee
    @Autowired
    private EmployeeServices employeeServices;
    @GetMapping("/")
    public String viewHomepage(Model model)
    {
        model.addAttribute("listemplyees",employeeServices.getAllEmploye());
        return "index";
    }


}
