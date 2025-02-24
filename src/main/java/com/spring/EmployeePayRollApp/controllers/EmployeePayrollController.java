package com.spring.EmployeePayRollApp.controllers;


import com.spring.EmployeePayRollApp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<String> getEmployeePayrollData(){
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId){
        return new ResponseEntity<String>("Get Call Success for id: " + empId,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
        return new ResponseEntity<String>("Created Employee Payroll Data for : "+empPayrollDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
        return new ResponseEntity<String>("Created Employee Payroll Data for: " + employeePayrollDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable ("empId") int empId){
        return new ResponseEntity<String>("Delete Call Success for id:" + empId , HttpStatus.OK);
    }
}
