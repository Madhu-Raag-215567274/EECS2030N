package fms;

public class FlightInfo {
	String name;
	String airline;
	
	public FlightInfo(String string, String string2) {
		// TODO Auto-generated constructor stub
		name =string;
		airline=string2;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getairline() {
		return airline;
	}


	public void setairline(String airline) {
		this.airline = airline;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}		
	 if(obj == null) {
		 return false;
	 }
	
	if(this.getClass()!= obj.getClass()) {
		return false;
	}
	FlightInfo other = (FlightInfo) obj;
	if(other.getName().equals(this.getName())&& other.getairline().equals(this.getairline())) {
		return true;
	}
	else {
		return false;
	}
	
	}
	





}
