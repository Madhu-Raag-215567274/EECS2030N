package myUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MyTreeSet<E> extends MyAbstractSet<E> {

	
	 
	protected TreeMap <E, Object> map;   // non-private for testing purposes
	
	// Dummy value to associate with an Object in the backing Map
    private static final Object PRESENT = new Object();
	
	
    /**
     * Constructs a new, empty set;  
     */
    public MyTreeSet() {
    	// COMPLETE THIS
    }
    
    
    // addAll
	@Override
    public Iterator<E> iterator(){
		// COMPLETE THIS
    }
       
	@Override
	public boolean contains(E o) {
		// COMPLETE THIS
	}
	
	@Override
	public boolean add(E e) {
		// COMPLETE THIS
	
	}
	
	@Override
	public boolean remove(E o) {
		// COMPLETE THIS
	}

	@Override
	public void clear() {
		// COMPLETE THIS
		
	}
	
	
	 

}
