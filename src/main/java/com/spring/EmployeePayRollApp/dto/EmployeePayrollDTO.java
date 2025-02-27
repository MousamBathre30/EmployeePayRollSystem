package com.spring.EmployeePayRollApp.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

public @Data class EmployeePayrollDTO {
    @NotEmpty(message = "Employee name cannot be null")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    public String name;

    @Min(value = 500 , message = "Min Wage should be more than 500")
    public long salary;


    public EmployeePayrollDTO(String name,long salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "name=" + name + ": Salary="+salary;
    }

}
