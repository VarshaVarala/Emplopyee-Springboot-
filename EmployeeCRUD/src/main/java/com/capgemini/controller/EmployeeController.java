package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.*;

import com.capgemini.entity.Employee;
import com.capgemini.service.IEmployeeService;
@RestController
@RequestMapping("/bank")
@CrossOrigin("http://localhost:1234")
public class EmployeeController {
	

		    @Autowired
		    IEmployeeService employeeService;

		    @GetMapping("/findEmployeeById/{enter id}")
		    public Employee findEmployeeById(@PathVariable("enter the id") int id) {
		        Employee employee = employeeService.findEmployeeById(id);
		        if (employee == null) {
		        System.out.println("user not found for id=" + id);
		        }
		         return employeeService.findEmployeeById(id);
		    }


		   @PostMapping("/createEmployee")
		    public String createEmployee(@RequestBody Employee employee) {
		       Employee e=employeeService.createEmployee(employee);
		       if (e == null) {
		            System.out.println("already exists");
		        }
		         return "Employee created successfully!";
		    }
		   
		   @PutMapping("/updateEmployee")
		   public String updateEmployee(@RequestBody Employee employee) {
		       Employee e=employeeService.createEmployee(employee);
		       if (e == null) {
		    	   return "Employee doesn't exists";
		        }
		       else
		    	   return "Updates details are:"+ employee.getId()+" "+employee.getName()+" "+employee.getSal();
		    }
		   @DeleteMapping("/deleteEmployee/{id}")
		   public String deleteEmployee(@PathVariable("id") int id) {
		       Employee e=employeeService.deleteEmployee(id);
		       if (e == null) {
		            return "Employee doesn't exists";
		       }
		       else
		    	   return "Employee details deleted successfully";
		       }
		   @GetMapping("/findAllEmployees")
		   public List<Object>findAllEmployees(){
			   List<Object>employees=employeeService.findAllEmployees();
			   return employees;
			   
		   }
		       
	}

