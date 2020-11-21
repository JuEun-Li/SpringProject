package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Employee;
import net.skhu.mapper.DepartmentMapper;
import net.skhu.mapper.EmployeeMapper;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeMapper employeeMapper;

	@Autowired
	DepartmentMapper departmentMapper;

	@RequestMapping("list")
	public String list(Model model) {
		List<Employee> employees = employeeMapper.findAll();
		model.addAttribute("employees", employees);
		return "employee/list";
	}

}
