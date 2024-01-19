package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.Employee;
@RequestMapping("/employee")
@Controller
public class Employeecontroller {

	@RequestMapping("/add")
	public String addEmployee(Model m)
	{
		Employee emp=new Employee();
		System.out.println("sdaddffs");
		m.addAttribute("empl", emp);
		return "addemployee";
		
	}
	@RequestMapping("/view")
	public String ViewEmployee(@ModelAttribute("empl") Employee e,Model mv)
	{		mv.addAttribute("view", e);
		
		return "viewpage";
		
	}
}
