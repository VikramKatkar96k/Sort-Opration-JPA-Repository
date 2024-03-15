package com.Employee.respo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.Entity.Employee;

public interface IEmployee extends JpaRepository<Employee, Integer>
{
}
