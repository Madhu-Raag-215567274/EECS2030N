package fms;

public class PassengerInfo implements Comparable<PassengerInfo> {
	
	String name;
	double ticketamount;
	int flightid;
	public PassengerInfo(String string, int i, int j) {
		// TODO Auto-generated constructor stub
		name =string;
		ticketamount=i;
		flightid=j;
		
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTicketamount() {
		return ticketamount;
	}

	public void setTicketamount(double ticketamount) {
		this.ticketamount = ticketamount;
	}

	public int getFlightId() {
		return flightid;
	}

	public void setFlightId(int flightid) {
		this.flightid = flightid;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		PassengerInfo other = (PassengerInfo) obj;
		if (flightid != other.flightid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (this.getTicketamount()!= other.getTicketamount())
			return false;

		return true;
	}
	
	public int compareTo(PassengerInfo other) {
		if(this.getTicketamount()<other.getTicketamount()) {
			return -1;
		}
		else if (this.getTicketamount()>other.getTicketamount()) {
			return 1;
		}
		else  {
			if (this.flightid<other.flightid) {
				return 1;
			}
			else if (this.flightid>other.flightid){
				return -1;
			}else {
				return 0;
			}
		}
		
		//return flightid;
		
	}

	



}
