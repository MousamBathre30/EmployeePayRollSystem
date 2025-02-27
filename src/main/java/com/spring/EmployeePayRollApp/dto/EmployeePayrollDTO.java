package com.spring.EmployeePayRollApp.dto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
public @ToString class EmployeePayrollDTO {

    @NotEmpty(message = "Employee name cannot be null")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    private String name;

    @Min(value = 500 , message = "Min Wage should be more than 500")
    private long salary;

    private String gender;

    private String startDate;

    private String note;

    private String profilepic;

    private List<String> departments;  // ✅ FIXED: Un-commented

}
