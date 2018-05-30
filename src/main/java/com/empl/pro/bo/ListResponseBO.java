/**
 * 
 */
package com.empl.pro.bo;

import java.io.Serializable;
import java.util.List;

/**
 * @author Vaibhav.Singh
 *
 */
public class ListResponseBO<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7382718930407853206L;

	private List<T> data;
	
	private String message;

	/**
	 * @return the data
	 */
	public List<T> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<T> data) {
		this.data = data;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	
}
