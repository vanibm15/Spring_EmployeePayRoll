package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.model.Employee;

import java.util.List;

public interface IemployeePayRollService {
    String getMessage();

    String addEmployee(Employee employee);

    List<Employee> getListOfEmployees();

    Employee getEmployeeDetails(int getId);

    Employee deleteEmployee(int id);

    Employee updateEmployee(int getId, Employee employee);
}
