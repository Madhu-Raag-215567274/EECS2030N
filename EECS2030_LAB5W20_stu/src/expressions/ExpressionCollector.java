package expressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExpressionCollector {
	 
	protected List<Expression> expressions;
	protected Object value;
	protected String defaultValue;
	 
	
	ExpressionCollector() {
		this.expressions= new ArrayList<Expression>();
		// COMPLETE THIS create an empty collection of expression
		 
	}
	
	/**
	 * Add a new expression.
	 * @param e an expression
	 */
	void addExpression(Expression e) {
		this.expressions.add(e);
		// COMPLETE THIS
	}
	
	/**
	 * Add a new expression.
	 * @param left integer value of the left operand 
	 * @param op operator (i.e., "+", "-", "*", ">", "<", "==")
	 * @param right integer value of the right operand
	 */
	void addExpression(int left, String op, int right) {
		//int p;
		if(op.equals("+")) {
			Expression c =new Addition(left, right) ;
			this.expressions.add(c);
			
		}
		else if (op.equals("-")) {
			Expression c =new Subtraction(left, right) ;
			this.expressions.add(c);
		}
		else if (op.equals("*")) {
			Expression c =new Multiplication(left, right) ;
			this.expressions.add(c);
		}
		else if(op.equals(">")) {
			Expression c =new GreaterThan(left, right) ;
			this.expressions.add(c);
		}
		else if(op.equals("<")) {
			Expression c =new LessThan(left, right) ;
			this.expressions.add(c);
		}
		else  {
			Expression c =new Equal(left, right) ;
			this.expressions.add(c);
		}
		
		
		// COMPLETE THIS
		// Hint: Depending on the operator given (e.g., +), create the corresponding expression object
		// (e.g., Addition) and add it to the collector.
		 
	}
	
	/**
	 * sub-routine that can be used to check if this is type correct
	 * true if e is one of the three classes, or their subclasses (if any)
	 * so use instanceof, instead of getClassName()
	 */
	private boolean isArithmetic(Expression e) {
		return 
				e instanceof Addition 
			||	e instanceof Subtraction
			|| 	e instanceof Multiplication;
	}
	
	/**
	 * sub-routine that can be used to check if this is type correct
	 * true if e is one of the three classes, or their subclasses (if any)
	 */
	private boolean isRelation(Expression e) {
		return 
				e instanceof Equal 
			||	e instanceof GreaterThan
			|| 	e instanceof LessThan;
	}
	
	/**
	 * If this collector is AddAll or TimesAll, then all stored expressions must be integer expressions
	 * (i.e., Addition, Subtraction, Multiplication).
	 * If this collection is ConjoinAll or DisjoinAll, then all stored expressions must be boolean expressions
	 * (i.e., GreaterThan, LessThan, Equal)
	 * @return whether it is possible to evaluate the stored collection of expressions.   
	 */
	boolean isTypeCorrect() {
		if(this.expressions.size()==0) {
			return true;
		}
		Expression a =new Addition(0, 0);
		Expression s =new Subtraction(0, 0);
		Expression m =new Multiplication (0, 0);
		Expression g =new GreaterThan(0, 0);
		Expression l =new LessThan(0, 0);
		Expression e =new Equal(0, 0);
         Boolean result=true;
         int flag;
         
         if(this.expressions.get(0).getClass()==a.getClass() ||
        		 this.expressions.get(0).getClass()==s.getClass()|| 
        		 this.expressions.get(0).getClass()==m.getClass()) {
        	 flag=1;
         }
         else {
        	 flag=0;
         }
		
		for(int i =1; i<this.expressions.size() && result;i++) {
			if(flag==1){
				if(this.expressions.get(i).getClass()==g.getClass()||
						this.expressions.get(i).getClass()==l.getClass()||
						this.expressions.get(i).getClass()==e.getClass()) {
					result =false;
					
				}
			}
			else if(flag==0) {
				if(this.expressions.get(i).getClass()==a.getClass()||
						this.expressions.get(i).getClass()==s.getClass()||
						this.expressions.get(i).getClass()==m.getClass()) {
					result =false;
					
				}
			}
		}
		return result;
		// COMPLETE THIS
	}
	
	/**
	 * Get the result of the latest evaluation (i.e., after the latest call to `evaluate()`).
	 * @return the last evaluation result.
	 */
	Object getValue() {
		// COMPLETE THIS
		return value;
	}
	
	/**
	 * Obtain the list of stored expressions, as an array.
	 * @return all stored expressions as an array
	 */
	Expression[] getExpressions() {
		Expression[] p = new Expression[this.expressions.size()];
		for(int i =0;i<this.expressions.size();i++) {
			p[i]= this.expressions.get(i);
		}
		return p;
		// COMPLETE THIS
	}
	
	/**
	 * Given that this expression collector is type correct (see `isTypeCorrect()`),
	 * evaluate it. Store the evaluation result so that it can be returned by `getValue()`. 
	 */
	void evaluate() {
		// Hint: Leave this empty and override it in all subclasses such as Addition, GreaterThan.
	}
	
	/**
	 * Override the equals method. Two expression collectors are equals if:
	 * 1) They are both type correct 2) Their evaluation results are identical
	 * @return whether or not the two expression collectors are equal.
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		ExpressionCollector other = (ExpressionCollector) obj;
		if(this.isTypeCorrect() && other.isTypeCorrect()) {
			this.evaluate();
			other.evaluate();
			Object p = this.getValue();
			Object e = other.getValue();
			if(p==e) {
				return true;
			}
			else {
				return false;
			}
			// COMPLETE THIS
		}
		else {
			return false;
			// COMPLETE THIS
		}
			 
	}
	
	
}
