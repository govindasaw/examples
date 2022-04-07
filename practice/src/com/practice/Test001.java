package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(10,"Nilesh");
		Employee e1 = new Employee(10,"Nilesh");
		Map<Employee,String> map = new HashMap<Employee,String>();
//		map.put(e,"Govinda");
//		e.setName("Ghadge");
//		map.get(e);
		map.put(e, e.getName());
		map.put(e, e.getName());
//		for()
		System.out.println(map.size());
	}

}

class Employee {
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
//		final int prime = 31;
		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
		return false;
	}
	
	
}
