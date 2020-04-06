package com.capgemini.service;

import com.capgemini.dao.IEmployeeDao;
import com.capgemini.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.Employee;

import java.util.List;

import javax.transaction.Transactional;

@Service//@Component
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	
	    @Autowired
	    private IEmployeeDao dao;

	    public IEmployeeDao getDao(){
	        return dao;
	    }

	    public void setDao(IEmployeeDao dao){
	        this.dao=dao;
	    }


		@Override
		public Employee findEmployeeById(int id) {
			Employee employee= dao.findEmployeeById(id);
		       return employee;
		}

		@Override
		public Employee createEmployee(Employee employee) {
			  employee= dao.createEmployee(employee);
		        return employee;
		}

		@Override
		public Employee updateEmployee(Employee employee) {
			return dao.updateEmployee(employee);
		}

		@Override
		public List findAllEmployees() {
			return dao.findAllEmployees();
		}

		@Override
		public Employee deleteEmployee(int id) {
			Employee employee= dao.deleteEmployee(id);
		       return employee;
			
		}
	}

