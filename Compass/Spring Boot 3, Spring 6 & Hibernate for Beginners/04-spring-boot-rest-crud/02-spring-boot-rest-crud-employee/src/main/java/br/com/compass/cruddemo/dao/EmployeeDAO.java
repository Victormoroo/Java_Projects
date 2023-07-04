package br.com.compass.cruddemo.dao;

import br.com.compass.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
