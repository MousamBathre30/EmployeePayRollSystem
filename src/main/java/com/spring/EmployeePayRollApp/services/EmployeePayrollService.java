package com.spring.EmployeePayRollApp.services;

import com.spring.EmployeePayRollApp.dto.EmployeePayrollDTO;
import com.spring.EmployeePayRollApp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollServise {


    public List<EmployeePayrollData> getEmployeePayrollData(){
        List<EmployeePayrollData> empDataList = new ArrayList<>();
        empDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",30000)));
        return empDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empid) {
        return null;
    }

    public EmployeePayrollData getEmployeePayrollDataByID(int empId){
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1 , new EmployeePayrollDTO("Pankaj" , 30000));
        return empData;
    }

    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO){
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,empPayrollDTO);
        return empData;
    }

    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO){
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1 ,empPayrollDTO);
        return empData;
    }

    public void deleteEmployeePayrollData(int empId){
        //employeePayrollList.remove(empId-1);
    }
}
