package com.spring.EmployeePayRollApp.model;

import com.spring.EmployeePayRollApp.dto.EmployeePayrollDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "newTable4")
@NoArgsConstructor
@AllArgsConstructor
public @Data class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilepic;

   // ✅ Converts List<String> to String
    private List<String> departments;

    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.name = employeePayrollDTO.getName();
        this.salary = employeePayrollDTO.getSalary();
        this.gender = employeePayrollDTO.getGender();
        this.note = employeePayrollDTO.getNote();
        this.startDate = LocalDate.parse(employeePayrollDTO.getStartDate());
        this.profilepic = employeePayrollDTO.getProfilepic();
        this.departments = employeePayrollDTO.getDepartments();
    }
}
