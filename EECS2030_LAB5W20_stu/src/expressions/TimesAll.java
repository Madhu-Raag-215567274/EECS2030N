package expressions;

public class TimesAll extends ExpressionCollector {
	
	public TimesAll() {
		super();
	} 
	void evaluate() {
		
		
		super.value= 1;
		int sum=1;
		int counter = 0;
		
		for(int i =0;i<this.expressions.size();i++) {
			this.expressions.get(i).evaluate();
			sum=sum*(Integer)this.expressions.get(i).getValue();
			counter=1;
			
		}
		if(counter==1) {
			super.value=sum;
		}
		
		
	}

}
