package com.bridgelabz.employeepayroll.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;
@Entity
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

    public Employee() {
    }

    public Employee(int id, String employeeName, String gender, String department, long salary, String email, LocalDate joiningDate, String profilePic, String note) {
        this.id = id;
        this.employeeName = employeeName;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.joiningDate = joiningDate;
        this.profilePic = profilePic;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", joiningDate=" + joiningDate +
                ", profilePic='" + profilePic + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
