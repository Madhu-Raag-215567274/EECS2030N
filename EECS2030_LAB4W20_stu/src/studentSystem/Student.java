package studentSystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
	
	static int serial = 0;    // non-private for testing
	String name;   // non-private for testing
	int year;   // non-private for testing
	String yorkID;    // non-private for testing
	Date joinDate;     // non-private for testing
	Set<Course> courses;   // assume no duplicate courses so use a set  // non-private for testing
	List<GPA> GPAs;  // non-private for testing
	
	
	/**
	 * create a student with empty courses and GPAs
	 */
	public Student() {
		
	}
	
	
	
	public Student(String name, int year, Date joinDate, Set<Course> courses, List<GPA> gpas) {
		this.name = name;
		this.year = year;
		this.joinDate = joinDate;
		this.courses = course;
		this.GPAs = gpas;
		
		 
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
	 * @return the id
	 */
	public String getYorkID() {
		return yorkID;
	}
	
	
	/**
	 * @param id the id to set
	 */
	public void setYorkID(String id) {
		this.yorkID = id;
	}
	
	
	/**
	 * @return the joinDate
	 */
	public Date getJoinDate() {
		return this.joinDate;
	}
	
	
	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
	/**
	 * @return the course
	 */
	public Set<Course> getCourses() {
		return this.courses;
	
	}
	
	
	/**
	 * @param courses the course to set
	 */
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	/**
	 * @return the gpas
	 */
	public List<GPA> getGPAs() { // need deep copy
		return this.GPAs;
		
	}
	
	
	/**
	 * @param gpas the gpas to set
	 */
	public void setGPAs(List<GPA> gpas) {
		this.GPAs = gpas;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
}
