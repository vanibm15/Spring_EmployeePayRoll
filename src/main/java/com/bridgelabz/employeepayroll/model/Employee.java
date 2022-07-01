package com.bridgelabz.employeepayroll.model;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@ToString

public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String employeeName;
    private String gender;
    private String department;
    private long salary;
    private String email;
    private LocalDate joiningDate;
    private String profilePic;
    private String note;



    public Employee(EmployeeDTO employeedto) {
        this.employeeName = employeedto.getEmployeeName();
        this.gender = employeedto.getGender();
        this.department = employeedto.getDepartment();
        this.salary = employeedto.getSalary();
        this.email = employeedto.getEmail();
        this.joiningDate = employeedto.getJoiningDate();
        this.profilePic = employeedto.getProfilePic();
    }

   }
