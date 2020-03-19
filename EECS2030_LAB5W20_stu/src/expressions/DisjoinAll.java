package expressions;

public class DisjoinAll extends ExpressionCollector {
	public DisjoinAll() {
		// TODO Auto-generated constructor stub
		super();
	}
	void evaluate() {
		
		
		super.value= false;
		boolean sum=false;
		int counter = 0;
		
		for(int i =0;i<this.expressions.size();i++) {
			this.expressions.get(i).evaluate();
			sum=sum||(Boolean)this.expressions.get(i).getValue();
			counter=1;
			
		}
		if(counter==1) {
			super.value=sum;
		}
		
		
	}
	

}
