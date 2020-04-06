package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	
	 @PersistenceContext
	    private EntityManager em;

	    public EmployeeDaoImpl(){
	    }

		@Override
		public Employee findEmployeeById(int id) {
			   Employee e= em.find(Employee.class,id);
			      return e;
		}

		@Override
		public Employee createEmployee(Employee employee) {
			 employee=em.merge(employee);
		        return employee;
		}

		@Override
		public List<Object> findAllEmployees() {
			Query q=em.createQuery("select e from Employee e");
			List<Object> allEmployees=q.getResultList();
			return allEmployees;
		}

		@Override
		public Employee deleteEmployee(int id) {
			Employee e=em.find(Employee.class, id);
			em.refresh(e);
			return e;
		}

		@Override
		public Employee updateEmployee(Employee employee) {
			Employee e=em.find(Employee.class,employee.getId());
			e.setName(employee.getName());
	        e.setSal(employee.getSal());
	        em.merge(e);
	        return e;
		}
	    
	    

}
