package com.capgemini.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//@Component
@Table(name = "emptable")
public class Employee{
	    @Id
	    @GeneratedValue
	    private Integer id;
	    private String name;
	    private Integer sal;
	    
	    public Integer getId(){
	        return id;
	    }
	    public void setId(final Integer id){
	        this.id=id;
	    }
	    
	    public String getName(){
	        return name;
	    }
	    public void setName(final String name){
	        this.name=name;
	    }
	    
	    public Integer getSal() {
			return sal;
		}
		public void setSal(Integer sal) {
			this.sal = sal;
		}
		
		public Employee(Integer id, String name, Integer sal) {
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
		}
	    
	    
	}

