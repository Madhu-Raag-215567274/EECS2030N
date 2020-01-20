package lab1package3;

public class TourismBook {
	Attraction[] att=new Attraction [100];
	 int noa=0;

	public Attraction[] getAttractions() {
		// TODO -generated method stub
		

		Attraction[]temp= new Attraction[noa];
		for(int i=0;i<noa;i++) {
			temp[i]=att[i];
		}
		
		
		return temp;
	}

	public void addAttraction(Attraction p1) {
		// TODO Auto-generated method stub
		att[noa]=p1;
		noa++;
		
	}

	public void addAttraction(String string, double d) {
		// TODO Auto-generated method stub
		Attraction p =new Attraction(string,d);
		att[noa]=p;
		noa++;
				
		
	}

	public String nameBestAttraction() {
		double price1=att[0].price;
		int index=0;
		for(int i=1;i<noa;i++) {
			if(price1>att[i].price) {
				price1=att[i].price;
				index=i;
			}
			
		}
		
		return att[index].name;
	}


	

}
