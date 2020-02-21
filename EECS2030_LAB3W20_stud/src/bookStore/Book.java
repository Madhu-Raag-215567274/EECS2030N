package bookStore;

public class Book {

	String title;
	double price;
	int year;
	public Book() {
		title=null;
		year=0;
		price=0.0;
	}
	public Book(String string, int i, double j) {
		// TODO Auto-generated constructor stub
		title=string;
		year=i;
		price=j;
	
		
	}
	public Book(Book book) {
		this(book.title,book.year,book.price);
	}
	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}
	
	public int getYearPublished() {
		return year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", year=" + year + "]";
	}
	
	public int compareTo(Book other) {
		
		if(this.getPrice()>other.getPrice()) {
			return 1;
		}
		else if(this.getPrice()<other.getPrice()) {
			return -1;
		}
		else {	return 0;}
		// TODO Auto-generated method stub
	

	}

	

}
