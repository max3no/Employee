package com.empl.pro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empl.pro.pojo.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
