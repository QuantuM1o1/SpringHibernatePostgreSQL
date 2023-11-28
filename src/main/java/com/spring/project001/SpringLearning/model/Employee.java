package com.spring.project001.SpringLearning.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "table_employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private char sex;
    @Column
    private String department;
    @Column
    private Date date_of_birth;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public char getSex()
    {
        return sex;
    }

    public void setSex(char sex)
    {
        this.sex = sex;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public Date getDate_of_birth()
    {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth)
    {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", department='" + department + '\'' +
                ", date_of_birth=" + date_of_birth +
                '}';
    }
}
