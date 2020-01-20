package lab1package3;

public class Attraction {
	String name;
	double price;
	public Attraction(String string, double d) {
		// TODO Auto-generated constructor stub
		name =string;
		price=d;
	}

	public Attraction() {
		name =null;
		price=0.0;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public void printNamePrice() {
		System.out.println(name + " "+ price);
		}

	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		this.name=string;
	}

	public void setName(double d) {
		this.price=d;
		// TODO Auto-generated method stub
		
	}

}
