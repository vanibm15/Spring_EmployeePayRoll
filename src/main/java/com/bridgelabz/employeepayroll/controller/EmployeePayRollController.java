package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.model.Employee;
import com.bridgelabz.employeepayroll.service.IemployeePayRollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeePayRollservice")

public class EmployeePayRollController {

    @Autowired
    IemployeePayRollService employeeService;

    @GetMapping("/home")
    public String home() {
        String message = employeeService.getMessage();
        return message;
    }

    @PostMapping("/addemploye")
    public String add(@RequestBody Employee employee) {
        String addEmployee = employeeService.addEmployee(employee);
        return addEmployee;

    }
    @GetMapping("/getEmployees")
    public List<Employee>getEmployees()
    {
        List<Employee>employees=employeeService.getListOfEmployees();
        return employees;
    }
    @GetMapping("/getEmployee/{getId}")
    public Employee getEmployee(@PathVariable int getId){
        Employee employee=employeeService.getEmployeeDetails(getId);
        return employee;
    }
    @DeleteMapping("/delete")
    public String deleteEmployee(@RequestParam int id){
        Employee employee=employeeService.deleteEmployee(id);
        return "deleted.....!";
    }
    @PutMapping("/updateEmployee/{getId}")
    public Employee updateEmployee(@PathVariable int getId,@RequestBody Employee employee){
        Employee employee1=employeeService.updateEmployee(getId,employee);
        return employee1;

    }


}
