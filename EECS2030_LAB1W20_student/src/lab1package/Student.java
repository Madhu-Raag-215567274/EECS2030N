package lab1package;

public class Student {
	
	String name;
	String address;
	String[] course=new String[30] ;
	int [] grades=new int[30]; 
	int counter=0;
	
	public Student(String name, String address) {
		this.name =name;
		this.address=address;
		System.out.println(name+"("+address+")");
		//System.out.println(address);
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		System.out.println(name+"("+address+")");
		
	}
	public String getName() {
		
		return name;
	}
	public void addCourseGrade(String course, int grade) {
		this.course[counter]=course;
		this.grades[counter]=grade;
		//System.out.print(this.course[counter]+":"+this.grades[counter]);
		counter++;
		
	}
	public void printGrades() {
		System.out.print(name);
		for(int i=0;i<counter;i++) {
			System.out.print(" "+this.course[i]+":"+this.grades[i]);
		}
		System.out.println("");
		//System.out.println(grades);
		// TODO Auto-generated method stub
		
	}
	public double getAverageGrade() {
	double sum = 0;
	for(int i=0;i<counter;i++) {
		
		sum+=grades[i];
	}
		// TODO Auto-generated method stub
		return sum/counter;
	}
	
	
	
}
