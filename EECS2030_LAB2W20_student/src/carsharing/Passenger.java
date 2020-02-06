package carsharing;

public class Passenger {
	String name;
	int destination;

	public Passenger(String name, int dest) {
		// TODO Auto-generated constructor stub
		this.name =name;
		this.destination=dest;
	}
	public int getDestination() {
		return destination;
		
	}
	public String toString() {
		return "Name of the passenger:"+ this.name+ "and destination: " +this.destination;
	}

}
