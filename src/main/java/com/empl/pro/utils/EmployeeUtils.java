package com.empl.pro.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.empl.pro.bo.EmployeeRequestBO;
import com.empl.pro.bo.EmployeeResponseBO;
import com.empl.pro.pojo.Employee;

public class EmployeeUtils {
	
	/**
	 * Convert {@link EmployeeRequestBO} to {@link Employee}
	 * @param employeeRequest
	 * @return
	 */
	public static Employee convertEmployeeRequestToBean(EmployeeRequestBO employeeRequest){
	
		if(employeeRequest != null && StringUtils.isNotBlank(employeeRequest.getFirstName()) 
				&& StringUtils.isNotBlank(employeeRequest.getLastName()) && StringUtils.isNotBlank(employeeRequest.getAddress())
				&& StringUtils.isNotBlank(employeeRequest.getNumber())){
			Employee employee = new Employee();
			
			employee.setFirstName(employeeRequest.getFirstName());
			employee.setLastName(employeeRequest.getLastName());
			employee.setAddress(employeeRequest.getAddress());
			employee.setMobileNumber(employeeRequest.getNumber());
			return employee;
		}
		
		return null;
		
	}
	
	/**
	 * Convert {@link Employee} to {@link EmployeeResponseBO}
	 * @param employee
	 * @return
	 */
	public static EmployeeResponseBO convertBeanToEmployeeResponse(Employee employee){
		
		if(employee != null){
			EmployeeResponseBO employeeResponse = new EmployeeResponseBO(employee.getId(), 
					employee.getFirstName(), employee.getLastName(), 
					employee.getAddress(), employee.getMobileNumber());
			
			return employeeResponse;
		}
		
		return null;
	}
	
	/**
	 * Convert list of {@link Employee} to list of {@link EmployeeResponseBO}
	 * @param employees
	 * @return
	 */
	public static List<EmployeeResponseBO> convertListOfBeanToListResponse(List<Employee> employees){
		
		if(employees != null && employees.size() > 0){
			
			List<EmployeeResponseBO> employeeResponse = employees.stream().
					map(emp -> convertBeanToEmployeeResponse(emp)).
					collect(Collectors.toList());
			
			return employeeResponse;
		}else
			return null;
	}

}
