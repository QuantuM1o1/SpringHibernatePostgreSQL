package com.spring.project001.SpringLearning.service;

import com.spring.project001.SpringLearning.dao.EmployeeDAO;
import com.spring.project001.SpringLearning.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService
{
    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    @Override
    public List<Employee> getList()
    {
        return employeeDAO.getList();
    }

    @Transactional
    @Override
    public Employee get(int id)
    {
        return employeeDAO.get(id);
    }

    @Transactional
    @Override
    public void add(Employee employee)
    {
        employeeDAO.add(employee);
    }

    @Transactional
    @Override
    public void delete(int id)
    {
        employeeDAO.delete(id);
    }
}
