package br.com.compass.cruddemo.service;

import br.com.compass.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
