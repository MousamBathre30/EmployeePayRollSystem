package com.spring.EmployeePayRollApp.services;

import com.spring.EmployeePayRollApp.dto.EmployeePayrollDTO;
import com.spring.EmployeePayRollApp.exceptions.EmployeePayrollException;
import com.spring.EmployeePayRollApp.exceptions.EmployeePayrollExceptionHandler;
import com.spring.EmployeePayRollApp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollServise {

  private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

  public List<EmployeePayrollData> getEmployeePayrollData(){
      return employeePayrollList;
  }

  public EmployeePayrollData getEmployeePayrollDataById(int empId){
      return employeePayrollList.stream().filter(empData -> empData.getEmployeeId() == empId).findFirst().orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));
  }
  public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO){
      EmployeePayrollData empData = null;
      empData = new EmployeePayrollData(employeePayrollList.size()+1, empPayrollDTO);
      employeePayrollList.add(empData);
      return empData;
  }

  public EmployeePayrollData updateEmployeePayrollData(int empID , EmployeePayrollDTO empPayrollDTO){
      EmployeePayrollData empData = this.getEmployeePayrollDataById(empID);
      empData.setName(empPayrollDTO.name);
      empData.setSalary(empPayrollDTO.salary);
      employeePayrollList.set(empID-1,empData);
      return empData;
  }
  public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO){
      EmployeePayrollData empData  = null;
      return empData;
  }

  public void deleteEmployeePayrollData(int empId){
      employeePayrollList.remove(empId-1);
  }

}
