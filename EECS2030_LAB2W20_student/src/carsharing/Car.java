package carsharing;

import java.beans.DesignMode;
import java.util.ArrayList;

public class Car {
	int idNo;
	int destination;
	int location;
	ArrayList <Passenger> passengers;
	
	double fareCollected;
	int milesDriven;
	double FAREPERMILE =1.0;
	int MAXPASSENGERS =3;
	

	public Car(int idNo, int location, int dest) {
		// TODO Auto-generated constructor stub
		this.idNo=idNo;
		this.location=location;
		this.destination=dest;
		this.passengers=null;
	}

	public int getDestination() {
		// TODO Auto-generated method stub
		return this.destination;
	}

	public int getIdNo() {
		// TODO Auto-generated method stub
		return this.idNo;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public int getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	public void drive() {
		if(location ==destination) {
			
		}else {
			fareCollected=passengers.size()*FAREPERMILE;
			location++;
			System.out.printf("Car %d drives to station %d" , this.idNo,this.location);
			
			
			
		}
		
		// TODO Auto-generated method stub
		
	}

	public boolean dropOff() {
		boolean flg=false;
		for(int i =0; i<passengers.size();i++) {
			if(passengers.get(i).getDestination()== location ) {
				passengers.remove(i);
				flg=true;
				System.out.println("Car "+ idNo +  " dropsoff " +passengers.get(i).name+  " at station " +
				this.location + " Now has " +  passengers.size()+  " passengers.");
							}
		}
		// TODO Auto-generated method stub
		return flg;
	}

	public boolean hasArrived() {
		// TODO Auto-generated method stub
		if(this.location==this.destination) {
			return true;
		}
		return false;
	}
	public boolean hasRoom() {
		if(passengers.size()<3) {
			return true;
		}
		return false;
		
	}

	public double getFares() {
		double sum=0;
		for(int i =0;i <passengers.size();i++) {
			sum+= Math.abs(passengers.get(i).getDestination()-this.location);
		}
		// TODO Auto-generated method stub
		return sum;
	}

	public int getMilesDriven() {
		// TODO Auto-generated method stub
		return Math.abs(destination-location);
	}
	public boolean add(Passenger p) {
		
		if(passengers.size()<3) {
			passengers.add(p);
			return true;
		}
		return false;
		
	}
	public String toString() {
		return idNo+", "+ location+","+ destination+" and "+ this.passengers; 
	}

	
		
}
		
	


