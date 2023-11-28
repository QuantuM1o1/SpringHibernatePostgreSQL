package com.spring.project001.SpringLearning.dao;

import com.spring.project001.SpringLearning.model.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO
{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getList()
    {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee get(int id)
    {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Employee.class, id);
    }

    @Override
    public void add(Employee employee)
    {
        Session currentSession = entityManager.unwrap(Session.class);
        if (this.get(employee.getId()) != null)
        {
            currentSession.merge(employee);
        }
        else
        {
            currentSession.persist(employee);
        }
    }

    @Override
    public void delete(int id)
    {
        Session currentSession = entityManager.unwrap(Session.class);
        Employee employee = currentSession.get(Employee.class, id);
        currentSession.remove(employee);
    }
}
