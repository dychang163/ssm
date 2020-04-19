package com.ssm.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.Employee;
import com.ssm.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	private EmpService service;
	
	@RequestMapping(value="/emps/{pageNum}", method=RequestMethod.GET)
	public String getAllEmp(Map<String, Object> map, @PathVariable("pageNum")Integer pageNum, HttpServletRequest request) {
		//通过PageHelper设置页面信息，第一个参数为页数，第二个参数为每页显示的条数
		PageHelper.startPage(pageNum, 4);
		List<Employee> empList = service.getAllEmp();
		//System.out.println("empList:"+empList.toString());
		//PageInfo中封装了分页相关的所有信息，当前页的页数，上一页的页数，下一页的页数，总页数，总条数...
		PageInfo<Employee> pageInfo = new PageInfo<>(empList, 5);
		//String page = PageUtil.getPageInfo(pageInfo, request);
		//map.put("empList", empList);
		//map.put("page", page);
		return "list";
	}
}
