package studentSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
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
		this.courses=null;
		GPAs=null;
		
	}
	
	
	
	public Student(String name, int year, Date joinDate, Set<Course> courses, List<GPA> gpas) {
		this.name = name;
		this.year = year;
		this.joinDate =new Date(joinDate.getYear(),joinDate.getMonth());
		this.GPAs = new ArrayList<GPA>(gpas);
		
		this.courses = new HashSet<Course>(courses);
		
		 
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
		serial++;
		if(serial<10) {
			this.yorkID="York-0"+serial;
		}else {
			this.yorkID="York-"+serial;
		}
		
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
		Date p= new Date(this.joinDate.getYear(),this.joinDate.getMonth());
		return p;
	}
	
	
	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(Date joinDate) {
		this.joinDate = new Date(joinDate.getYear(),joinDate.getMonth());
	}
	
	
	/**
	 * @return the course
	 */
	public Set<Course> getCourses() {
		Set<Course> p = new HashSet<Course>();
		for(Course i:this.courses) {
			p.add(i);
		}

		return p;
	
	}
	
	
	/**
	 * @param courses the course to set
	 */
	public void setCourses(Set<Course> courses) {
		Set<Course> p = new HashSet<Course>();
		for(Course i:courses) {
			p.add(i);
		}
		this.courses = p;
	}
	
	
	/**
	 * @return the gpas
	 */
	public List<GPA> getGPAs() {// need deep copy
		List <GPA> p=new ArrayList<GPA>();
		
		for(GPA a: this.GPAs) {
		GPA l =a;
		GPA f=new GPA (l.getYear(),l.getGPA());
	     p.add(f);
		}
		//System.out.println(this.GPAs.get(0)==p.get(0));

		return p;
		
	}
	
	
	/**
	 * @param gpas the gpas to set
	 */
	public void setGPAs(List<GPA> gpas) {

		
		List <GPA> p=new ArrayList<GPA>();
		for(int i =0; i<gpas.size();i++) {
			GPA c =new GPA(gpas.get(i).getYear(), gpas.get(i).getGPA());
			p.add(c);
			
		}
		this.GPAs = p;
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
