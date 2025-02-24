package com.spring.EmployeePayRollApp.services;

import com.spring.EmployeePayRollApp.dto.EmployeePayrollDTO;
import com.spring.EmployeePayRollApp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollServise {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empid);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);
}
