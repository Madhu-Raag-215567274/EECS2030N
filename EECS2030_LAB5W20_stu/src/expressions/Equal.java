package expressions;

public class Equal extends Expression {
	int i,j;
	public Equal(int i, int j) {
		super(i,j);
		this.i=i;
		this.j=j;
		// TODO Auto-generated constructor stub
	}
	void evaluate() {
		super.value= i==j;
	}
}
