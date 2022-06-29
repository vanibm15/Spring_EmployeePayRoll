package com.bridgelabz.employeepayroll.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private String employeeName;
    private String gender;
    private String department;
    private long salary;
    private String email;
    private LocalDate joiningDate;
    private String profilePic;
    private String note;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String employeeName, String gender, String department, long salary, String email, LocalDate joiningDate, String profilePic) {
        this.employeeName = employeeName;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.joiningDate = joiningDate;
        this.profilePic = profilePic;
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
        return "EmployeeDTO{" +
                "employeeName='" + employeeName + '\'' +
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
