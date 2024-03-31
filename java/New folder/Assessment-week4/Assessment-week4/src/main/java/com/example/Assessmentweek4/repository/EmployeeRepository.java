package com.example.Assessmentweek4.repository;

import com.example.Assessmentweek4.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long>  {


}
