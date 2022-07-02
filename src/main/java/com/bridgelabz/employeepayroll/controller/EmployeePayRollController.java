package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.dto.ResponseDTO;
import com.bridgelabz.employeepayroll.model.Employee;
import com.bridgelabz.employeepayroll.service.IemployeePayRollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ResponseEntity<ResponseDTO> add(@Valid @RequestBody EmployeeDTO employee) {
        String addEmployee = employeeService.addEmployee(employee);
        ResponseDTO responsedto = new ResponseDTO("User added successfully", addEmployee);

        return new ResponseEntity<ResponseDTO>(responsedto, HttpStatus.OK);
    }

    @GetMapping("/getEmployees")
    public ResponseEntity<ResponseDTO> getEmployees() {
        List<Employee> employees = employeeService.getListOfEmployees();
        ResponseDTO responsedto = new ResponseDTO("call for employee successfully...!", employees);

        return new ResponseEntity<ResponseDTO>(responsedto, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{getId}")
    public ResponseEntity<ResponseDTO> getEmployee(@PathVariable int getId) {
        Employee employee = employeeService.getEmployeeDetails(getId);
        ResponseDTO responsedto = new ResponseDTO("Call for Id successfull....!", employee);
        return new ResponseEntity<ResponseDTO>(responsedto, HttpStatus.OK);


    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDTO> deleteEmployee(@RequestParam int id) {
        employeeService.deleteEmployee(id);
        ResponseDTO responsedto = new ResponseDTO("deleted Id successfully....!", id);
        return new ResponseEntity<ResponseDTO>(responsedto, HttpStatus.OK);
    }

    @PutMapping("/updateEmployee/{getId}")
    public ResponseEntity<ResponseDTO> updateEmployee(@PathVariable int getId, @Valid @RequestBody EmployeeDTO employee) {
        Employee employee1 = employeeService.updateEmployee(getId, employee);
        ResponseDTO responsedto = new ResponseDTO("updated  employee deatils successfull", employee1);
        return new ResponseEntity<ResponseDTO>(responsedto, HttpStatus.OK);
    }

    @GetMapping("/department/{department}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("department") String department) {
        List<Employee> empDataList = null;
        empDataList = employeeService.getEmployeesByDepartment(department);
        ResponseDTO responseDTO = new ResponseDTO("Get Call for ID successful", empDataList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

}
