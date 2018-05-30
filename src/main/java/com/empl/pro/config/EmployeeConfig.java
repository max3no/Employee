package com.empl.pro.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:employee.properties")
public class EmployeeConfig {
	
	@Value("${save.emloyee}")
	private String saveEmployeeMessage;
	
	@Value("${error.employee}")
	private String errorEmployeeMessage;
	
	@Value("${blank.employee}")
	private String blankEmployeeMessage;
	
	@Value("${no.employee}")
	private String noEmployeeMessage;
	
	@Value("${employee.get.success}")
	private String successFetchMessage;
	
	
	/**
	 * @return the saveEmployeeMessage
	 */
	public String getSaveEmployeeMessage() {
		return saveEmployeeMessage;
	}

	/**
	 * @param saveEmployeeMessage the saveEmployeeMessage to set
	 */
	public void setSaveEmployeeMessage(String saveEmployeeMessage) {
		this.saveEmployeeMessage = saveEmployeeMessage;
	}

	/**
	 * @return the errorEmployeeMessage
	 */
	public String getErrorEmployeeMessage() {
		return errorEmployeeMessage;
	}

	/**
	 * @param errorEmployeeMessage the errorEmployeeMessage to set
	 */
	public void setErrorEmployeeMessage(String errorEmployeeMessage) {
		this.errorEmployeeMessage = errorEmployeeMessage;
	}

	/**
	 * @return the blankEmployeeMessage
	 */
	public String getBlankEmployeeMessage() {
		return blankEmployeeMessage;
	}

	/**
	 * @param blankEmployeeMessage the blankEmployeeMessage to set
	 */
	public void setBlankEmployeeMessage(String blankEmployeeMessage) {
		this.blankEmployeeMessage = blankEmployeeMessage;
	}

	/**
	 * @return the noEmployeeMessage
	 */
	public String getNoEmployeeMessage() {
		return noEmployeeMessage;
	}

	/**
	 * @param noEmployeeMessage the noEmployeeMessage to set
	 */
	public void setNoEmployeeMessage(String noEmployeeMessage) {
		this.noEmployeeMessage = noEmployeeMessage;
	}

	/**
	 * @return the successFetchMessage
	 */
	public String getSuccessFetchMessage() {
		return successFetchMessage;
	}

	/**
	 * @param successFetchMessage the successFetchMessage to set
	 */
	public void setSuccessFetchMessage(String successFetchMessage) {
		this.successFetchMessage = successFetchMessage;
	}
	

}
