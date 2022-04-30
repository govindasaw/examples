/**
 * 
 */
package com.practice;

import java.util.HashSet;

/**
 * @author Govin
 *
 */
public class Test012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		HashSet s = new HashSet();
		
		student s1 = new student(1,"g");
		student s2 = new student(1,"g");
		student s3 = new student(1,"g");
		student s4 = new student(1,"g");
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		System.out.println(s.size());

	}

}

class student{
	int id;
	String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param id
	 * @param name
	 */
	public student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		student other = (student) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
	
	
	
}
