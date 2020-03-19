package expressions;

public class LessThan extends Expression {
	int i,j;
	public LessThan(int i, int j) {
		// TODO Auto-generated constructor stub
		super(i,j);
		this.i=i;
		this.j=j;
	}
	void evaluate() {
		super.value= i<j;
	}

}
