package com.empl.pro.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empl.pro.bo.BaseResponse;
import com.empl.pro.bo.EmployeeRequestBO;
import com.empl.pro.bo.EmployeeResponseBO;
import com.empl.pro.bo.ListResponseBO;
import com.empl.pro.config.EmployeeConfig;
import com.empl.pro.services.EmployeeService;


/**
 * A Restful service containing various methods related to Employee
 *
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeConfig employeeConfig;
	
	/*
	 * save employee
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST,produces= "application/json")
	public ResponseEntity<BaseResponse> saveEmployee(@RequestBody EmployeeRequestBO employee){
			
			String response = StringUtils.EMPTY;
			HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
			BaseResponse baseResponse = new BaseResponse();
			try{
				response = employeeService.saveEmployee(employee);
				if(StringUtils.isNotBlank(response)){
					baseResponse.setMessage(response);
					status = HttpStatus.OK;
				}else
					baseResponse.setMessage("No data given");
			}catch(Exception e){
				response = e.getMessage();
				baseResponse.setMessage(response);
			}
			
			return new ResponseEntity<BaseResponse>(baseResponse,status);
	}
	
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public ResponseEntity<ListResponseBO<EmployeeResponseBO>> getEmployees(){
		
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		ListResponseBO<EmployeeResponseBO> response = new ListResponseBO<EmployeeResponseBO>();
		try{
			List<EmployeeResponseBO> employees = employeeService.getAllEmployees();
			if(employees != null && employees.size() > 0){
				response.setData(employees);
				response.setMessage(employeeConfig.getSuccessFetchMessage());
			}else{
				response.setMessage(employeeConfig.getNoEmployeeMessage());
			}
			status = HttpStatus.OK;
		}catch(Exception e){
			response.setMessage(e.getMessage());
		}
		
		return new ResponseEntity<ListResponseBO<EmployeeResponseBO>>(response,status);
	}

}
