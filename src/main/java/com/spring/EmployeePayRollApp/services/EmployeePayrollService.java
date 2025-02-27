package com.spring.EmployeePayRollApp.services;

import com.spring.EmployeePayRollApp.Repo.EmployeeRepository;
import com.spring.EmployeePayRollApp.dto.EmployeePayrollDTO;
import com.spring.EmployeePayRollApp.exceptions.EmployeePayrollException;
import com.spring.EmployeePayRollApp.model.EmployeePayrollData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all employees from the database
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeeRepository.findAll();
    }

    // Get employee by ID using JPA
    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeeRepository.findById((long) empId)
                .orElseThrow(() -> new EmployeePayrollException("Employee Not Found with ID: " + empId));
    }

    //  Create new employee and save to MySQL
    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = new EmployeePayrollData(empPayrollDTO);
        return employeeRepository.save(empData); // Saves to DB
    }

    //  Update employee data in MySQL --db 
    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData existingEmployee = getEmployeePayrollDataById(empId);
        existingEmployee.setName(empPayrollDTO.getName());
        existingEmployee.setSalary(empPayrollDTO.getSalary());
        return employeeRepository.save(existingEmployee); // Saves updated record to DB
    }

    //  Delete employee from MySQL -- db 
    @Override
    public void deleteEmployeePayrollData(int empId) {
        if (!employeeRepository.existsById((long) empId)) {
            throw new EmployeePayrollException("Cannot delete, Employee ID not found: " + empId);
        }
        employeeRepository.deleteById((long) empId);
    }
}
