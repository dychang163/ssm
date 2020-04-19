package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.Employee;
import com.ssm.bean.EmployeeExample;
import com.ssm.mapper.EmployeeMapper;
import com.ssm.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmployeeMapper employeeMapper;

	@Override
	public List<Employee> getAllEmp() {
		EmployeeExample example = new EmployeeExample();
		//example.createCriteria().andAgeEqualTo(12);
		List<Employee> selectByExample = employeeMapper.selectByExample(example);
		System.out.println("selectByExample:"+selectByExample.toString());
		
		
		
		return selectByExample;
	}

}
