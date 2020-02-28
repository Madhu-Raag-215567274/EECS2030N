package studentSystem;

public class GPA {
	private double gpa;

	private int year;

	public GPA(int i, double d) {
	
		year=i;
		gpa=d;
	}

	public void setGPA(int i) {
		this.gpa=i;
		// TODO Auto-generated method stub
		
	}

	public double getGPA() {
		// TODO Auto-generated method stub
		return this.gpa;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GPA other = (GPA) obj;
		if (Double.doubleToLongBits(gpa) != Double.doubleToLongBits(other.gpa))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}

