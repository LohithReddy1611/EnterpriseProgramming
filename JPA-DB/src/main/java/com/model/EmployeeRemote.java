package com.model;

import javax.ejb.Remote;

import com.entity.EmployeeEntity;

@Remote
public interface EmployeeRemote {
	public String insertData(EmployeeEntity E) throws Exception;
	

}

