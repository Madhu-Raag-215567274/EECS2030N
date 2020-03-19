package myUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MyLinkedHashSet<E> extends MyAbstractSet<E> {

	
	private static final int DEFAULT_CAPACITY = 10;
	
	 
	public LinkedHashMap <E, Object> map;  // non-private for testing purposes
	
	/** Dummy value to associate with an Object in the backing Map
    used as vlaues for all the keys in the backing Map
    */
    private static final Object PRESENT = new Object();
	
	
    /**
     * Constructs a new, empty set; 
     */
    public MyLinkedHashSet() {
    	// COMPLETE THIS
    }
    
    /**
	 * Create an empty set of default capacity
	 * 
	 */
    public MyLinkedHashSet(int initialCapacity) {
    	// COMPLETE THIS
    }
    
    
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
