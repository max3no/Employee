package com.empl.pro.services;

import java.util.List;

import com.empl.pro.bo.EmployeeRequestBO;
import com.empl.pro.bo.EmployeeResponseBO;

/**
 * Offers Service Interface which declares various operations performed over
 * Employee
 */
public interface EmployeeService {
	
	/**
	 * save employee
	 * @param employee
	 * @return
	 */
	public String saveEmployee(EmployeeRequestBO employee);
	
	public List<EmployeeResponseBO> getAllEmployees();

}
