package expressions;

public class Addition extends Expression {
     
	
	int i,j;
	public Addition(int i, int j) {
		// TODO Auto-generated constructor stub
		super(i,j);
		this.i=i;
		this.j=j;
		
	}
	void evaluate() {
		super.value= i+j;
	}

}
