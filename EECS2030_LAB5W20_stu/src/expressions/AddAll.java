package expressions;

public class AddAll extends ExpressionCollector {
	

	public AddAll() {
		
		super();

	
	}
	void evaluate() {
		
		
		super.value= 0;
		int sum=0;
		int counter = 0;
		
		for(int i =0;i<this.expressions.size();i++) {
			this.expressions.get(i).evaluate();
			sum+=(Integer)this.expressions.get(i).getValue();
			counter=1;
			
		}
		if(counter==1) {
			super.value=sum;
		}
		
		
	}

}
