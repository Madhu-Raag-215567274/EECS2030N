package expressions;

public class Subtraction extends Expression {
	int i,j;
	public Subtraction(int i, int j) {
		super(i,j);
		this.i=i;
		this.j=j;
		
		// TODO Auto-generated constructor stub
	}
	void evaluate() {
		super.value= i-j;
	}
	

}
