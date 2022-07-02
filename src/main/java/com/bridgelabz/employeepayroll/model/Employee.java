package com.bridgelabz.employeepayroll.model;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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

    @ElementCollection
    @CollectionTable(name = "employee_Department", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> departments;



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
