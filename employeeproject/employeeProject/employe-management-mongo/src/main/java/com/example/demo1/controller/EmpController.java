package com.example.demo1.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo1.entity.Employee;
import com.example.demo1.service.EmpService;

import empservice.Empp;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/employees")
		public ModelAndView employees() {
		ModelAndView model=new ModelAndView("employees");
		RestTemplate restTemplate= new RestTemplate();
		Empp result=restTemplate.getForObject("http://localhost:8087/employees/employee", Empp.class);
		System.out.println(result);
		model.addObject("employees",result.getemp());
		return model;
		}


	
	
	@GetMapping("/empform")
	public String addEmpForm() {
		return "empform";
	}
	
	
	@PostMapping("/save")
	public String empSave(@ModelAttribute Employee e,HttpSession session) {
		System.out.println(e);
		service.addEmp(e);
		session.setAttribute("msg", "Employee added successfully..");
		return "redirect:/viewemp";
	}
	
	@GetMapping("/viewemp")
	public String empView(Model m) {
		List<Employee> emp = service.getAllEmp();
		m.addAttribute("emp", emp);
		return "viewemp";
	}
	
	@GetMapping("/empeditform/{id}")
	public String empEdit(@PathVariable String id,Model m) {
		
		Employee e=service.getEmpById(id);
		m.addAttribute("emp", e);
		return "empeditform";
	}
	
	@PostMapping("/update")
	public String empUpdate(@ModelAttribute Employee e,HttpSession session) {
		
		service.addEmp(e);
		session.setAttribute("msg", "Employee updated successfully..");
		return "redirect:/viewemp";
	}
	
	@GetMapping("/delete/{id}")
	public String empDelete(@PathVariable String id,HttpSession session) {
		service.deleteEmp(id);
		session.setAttribute("msg", "Employee deleted successfully..");
		return "redirect:/viewemp";
	}
}
