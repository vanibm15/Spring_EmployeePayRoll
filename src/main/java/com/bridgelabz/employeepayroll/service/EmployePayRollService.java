package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.model.Employee;
import com.bridgelabz.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployePayRollService implements IemployeePayRollService {

    @Autowired
    EmployeeRepository employerepo;

    @Override
    public String getMessage() {
        return "Welcome to employeePayRollService";
    }

    @Override
    public String addEmployee(EmployeeDTO employeedto) {
        Employee employee = new Employee(employeedto);
        employerepo.save(employee);
        return employee.toString();
    }


    @Override
    public List<Employee> getListOfEmployees() {
        List<Employee> employees = employerepo.findAll();
        return employees;

    }

    @Override
    public Employee getEmployeeDetails(int getId) {
        Optional<Employee> employees = employerepo.findById(getId);
        return employees.get();
    }

    @Override
    public Employee deleteEmployee(int id) {
        employerepo.deleteById(id);
        return null;
    }


    @Override
    public Employee updateEmployee(int getId, EmployeeDTO employee) {
        Employee employee2 = new Employee(employee);
        Optional<Employee> employee1 = employerepo.findById(getId);
        if (employee1.isPresent()) {
            employee1.get().setEmployeeName(employee.getEmployeeName());
            employee1.get().setGender(employee.getGender());
            employee1.get().setDepartment(employee.getDepartment());
            employee1.get().setEmail(employee.getEmail());
            employee1.get().setJoiningDate(employee.getJoiningDate());
            employee1.get().setNote(employee.getNote());
            employee1.get().setProfilePic(employee.getProfilePic());
            employee1.get().setSalary(employee.getSalary());
            return employee1.get();

        } else
            return null;
    }
    @Override
    public List<Employee> getEmployeesByDepartment(String department) {
        return employerepo.findEmployeeByDepartment(department);
    }
}

