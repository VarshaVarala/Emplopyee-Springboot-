package com.capgemini.service;
import java.util.List;

import com.capgemini.entity.Employee;

public interface IEmployeeService {
	

    Employee findEmployeeById(int id);

    Employee createEmployee(Employee employee);
    List<Object> findAllEmployees();
    Employee deleteEmployee(int id);

    Employee updateEmployee(Employee employee);

}
