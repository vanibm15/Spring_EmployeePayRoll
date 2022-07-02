package com.bridgelabz.employeepayroll.repository;


import com.bridgelabz.employeepayroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    @Query(value = "select * from Employee, employee_department where id = id and department = :department",nativeQuery = true)
    List<Employee> findEmployeeByDepartment(String department);
}
