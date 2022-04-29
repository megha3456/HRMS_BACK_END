package com.megha.Employee_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megha.Employee_Management.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
