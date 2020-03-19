package expressions;

public class Multiplication extends Expression {
	int i,j;
	public Multiplication(int i, int j) {
		// TODO Auto-generated constructor stub
		super(i,j);
		this.i=i;
		this.j=j;
	}
	void evaluate() {
		super.value= i*j;
	}

}
