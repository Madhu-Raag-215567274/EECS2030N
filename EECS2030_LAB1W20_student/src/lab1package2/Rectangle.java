package lab1package2;

public class Rectangle {

	int height;
	int width;
	public Rectangle(int i, int j) {
		height=i;
		width=j;
		
		// TODO Auto-generated constructor stub
	}

	public Rectangle() {
		height=0;
		width=0;
	}

	public int getH() {
		// TODO Auto-generated method stub
		return this.height;
	}

	public int getW() {
		// TODO Auto-generated method stub
		return this.width;
	}

	public int getA() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

	public void setH(int i) {
		// TODO Auto-generated method stub
		this.height=i;
	}

	public void setW(int i) {
		// TODO Auto-generated method stub
		this.width=i;
		
	}
	@Override
	public String toString() {
		
		return "("+this.getH()+", "+this.getW()+","+ this.getA()+")";
		
	}


}
