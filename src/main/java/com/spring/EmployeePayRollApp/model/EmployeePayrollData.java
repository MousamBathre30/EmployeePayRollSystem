package com.spring.EmployeePayRollApp.model;

import com.spring.EmployeePayRollApp.dto.EmployeePayrollDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity  // Marks this class as a JPA Entity (Table in MySQL)
@Table(name = "employees_payroll") // Optional: Specifies table name
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increments ID
    private int id;

    private String name;
    private long salary;

    // ✅ Constructor to create entity from DTO
    public EmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        this.name = empPayrollDTO.getName();
        this.salary = empPayrollDTO.getSalary();
    }
}
