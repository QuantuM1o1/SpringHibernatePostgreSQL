package com.spring.project001.SpringLearning.controller;

import com.spring.project001.SpringLearning.model.Employee;
import com.spring.project001.SpringLearning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getList()
    {
        return employeeService.getList();
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id)
    {
        Employee employee = employeeService.get(id);
        if (employee == null)
        {
            throw new RuntimeException("Employee with an id: " + id + " was not found");
        }
        return employee;
    }

    @PostMapping("/employee")
    public Employee add(@RequestBody Employee employeeObj)
    {
        employeeService.add(employeeObj);
        return employeeObj;
    }

    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable int id)
    {
        employeeService.delete(id);
        return "Employee with an id: " + id + " has been deleted";
    }

    @PutMapping("/employee")
    public Employee update(@RequestBody Employee employeeObj)
    {
        employeeService.add(employeeObj);
        return employeeObj;
    }
}
