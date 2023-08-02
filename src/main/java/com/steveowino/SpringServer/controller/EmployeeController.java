package com.steveowino.SpringServer.controller;


import com.steveowino.SpringServer.model.employee.Employee;
import com.steveowino.SpringServer.model.employee.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employee/get-all")
    public List<Employee>getAllEmployees(){
        return employeeDao.getAllEmployee();
    }
    @PostMapping("/employee/save")
    public Employee save(@RequestBody Employee employee){ // consider using dto as method argument

        return employeeDao.save(employee);
    }
    
}
