package lab1package;

import java.awt.Color;

public class Circle {
	double radius;
   Color color;

	public Circle(double d, Color red) {
		
		if(d<0.0) {
			throw new IllegalArgumentException();
		}
		else {
		this.radius=d;
		
		this.color=red;
		}
		
		// TODO Auto-generated constructor stub
	}

	public Circle() {
		    this.radius=1.0;
		   this.color=Color.blue;
		// TODO Auto-generated constructor stub
	}



}
