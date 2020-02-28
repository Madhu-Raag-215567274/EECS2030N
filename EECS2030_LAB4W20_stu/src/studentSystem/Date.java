package studentSystem;

public class Date {

	int year;   

	int month;
	public Date(int year, int month) {
		// TODO Auto-generated constructor stub
		if(year<0 || month<1 ||month>12) {
			throw new IllegalArgumentException();
		}
		this.year=year;
		this.month=month;
	}
	 public int getYear() {
			return year;
		}

		public int getMonth() {
			return month;
		}

	public void setMonth(int i) {
		// TODO Auto-generated method stub
		if(i<1 ||i>12) {
			throw new IllegalArgumentException();
		}
		this.month=i;
		
	}

	public void setYear(int i) {
		if(i<0 ) {
			throw new IllegalArgumentException();
		}
	 this.year=i;
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
