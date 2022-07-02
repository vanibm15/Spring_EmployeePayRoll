package com.bridgelabz.employeepayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@ToString
public class EmployeeDTO {


    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$",message="Employee Name Invalid")
    private String employeeName;

    @Pattern(regexp = "male|female",message = "Gender Should be make or female ")
    private String gender;

    @NotNull(message="Department should not be null....!")
    private String department;

    @Min(value = 10000,message = "min salary should be more than 10000 ")
    private long salary;

    private String email;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull(message="Date should not be empty")
    private LocalDate joiningDate;

    private String profilePic;

    @NotNull(message = "Note should not be null")
    private String note;


}