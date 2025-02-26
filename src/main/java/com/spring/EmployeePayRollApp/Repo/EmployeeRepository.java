package com.spring.EmployeePayRollApp.Repo;

import com.spring.EmployeePayRollApp.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeePayrollData, Long> {
}
