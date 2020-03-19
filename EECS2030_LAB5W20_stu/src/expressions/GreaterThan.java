package expressions;

public class GreaterThan extends Expression {
	int i,j;
	public GreaterThan(int i, int j) {
		// TODO Auto-generated constructor stub
		super(i,j);
		this.i=i;
		this.j=j;
	}
	void evaluate() {
		super.value= i>j;
	}

}
