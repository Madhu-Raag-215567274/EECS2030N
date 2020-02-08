package carsharing;

import java.util.ArrayList;

public class Station {
	int stationNumber;
	ArrayList<Passenger> people;

	public Station(int number) {
		this.stationNumber=number;
	 //this.people;
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		// TODO Auto-generated method stub
		return stationNumber;
	}


	public void add(Passenger p) {
		// TODO Auto-generated method stub
		System.out.println(people);
		people.add(p);
	}
	public Passenger get(int index) {
		return people.get(index);
		
	}
	public Passenger remove(int index) {
		return people.remove(index);
		
	}
	
	public ArrayList<Passenger> peopleWaitingList(){
		return people;
		
	}
	public String toString() {
		return people.toString();
	}


}
