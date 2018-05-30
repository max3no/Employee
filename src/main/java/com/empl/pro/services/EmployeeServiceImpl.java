package com.empl.pro.services;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empl.pro.bo.EmployeeRequestBO;
import com.empl.pro.bo.EmployeeResponseBO;
import com.empl.pro.config.EmployeeConfig;
import com.empl.pro.dao.EmployeeDao;
import com.empl.pro.pojo.Employee;
import com.empl.pro.utils.EmployeeUtils;

/**
 * This class contains the service methods which are related to {@link EmployeeService}
 * related database operations.
 *
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private EmployeeConfig employeeConfig;
	
	@Override
	public String saveEmployee(EmployeeRequestBO employeeRequest) {
		
		String response = StringUtils.EMPTY;
		try{
			Employee employee = EmployeeUtils.convertEmployeeRequestToBean(employeeRequest);
			
			if(employee != null){
				LOGGER.info("----Save started----");
				employee = employeeDao.save(employee);
				LOGGER.info("---Save finished succesfully---");
				response = String.format(employeeConfig.getSaveEmployeeMessage(), employee.getId());
			}else{
				response = String.format(employeeConfig.getBlankEmployeeMessage());
			}
		}catch(Exception e){
			LOGGER.info("---Save finished unsuccesfully");
			throw new RuntimeException(String.format(employeeConfig.getErrorEmployeeMessage(),"save", e.getMessage()));
		}
				
		return response;
	}

	@Override
	public List<EmployeeResponseBO> getAllEmployees() {
		
		try{
			List<Employee> employees = employeeDao.findAll();
			if(employees != null && employees.size() > 0){
				List<EmployeeResponseBO> employeeResponse = EmployeeUtils.convertListOfBeanToListResponse(employees);
				if(employeeResponse != null && employeeResponse.size() > 0)
					return employeeResponse;
			}else{
				return null;
			}
		}catch(Exception e){
			throw new RuntimeException(String.format(employeeConfig.getErrorEmployeeMessage(),"get", e.getMessage()));
		}
		return null;
		
	}

}
