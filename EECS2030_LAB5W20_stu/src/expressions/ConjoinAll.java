package expressions;

public class ConjoinAll extends ExpressionCollector {
	
	public ConjoinAll() {
		// TODO Auto-generated constructor stub
		super();
	}
	void evaluate() {
		
		
		super.value= true;
		boolean sum=true;
		int counter = 0;
		
		for(int i =0;i<this.expressions.size();i++) {
			this.expressions.get(i).evaluate();
			sum=sum&&(Boolean)this.expressions.get(i).getValue();
			counter=1;
			
		}
		if(counter==1) {
			super.value=sum;
		}
		
		
	}

}
