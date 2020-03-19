package myUtil;

import java.util.HashMap;
import java.util.Iterator;

public class MyHashSet<E> extends MyAbstractSet<E> {

	
	protected HashMap <E, Object> map;   // non-private for testing purposes
	
	/** Dummy value to associate with an Object in the backing Map
	    used as vlaues for all the keys in the backing Map
	*/
    private static final Object PRESENT = new Object();
	
	
    /**
     * Constructs a new, empty set; 
     */
    public MyHashSet() {
        map = new HashMap<>();
    }
    
    /**
	 * Create an empty set of default capacity
	 * 
	 */
    public MyHashSet(int initialCapacity) {
        super(); // can be skipped
    	this.map = new HashMap<>(initialCapacity);
    }
    
     
	@Override
    public Iterator<E> iterator(){
    	return map.keySet().iterator();
    }
       
	@Override
	public boolean contains(E o) { 

	return map.containsKey(o);
	}
	
	@Override
	// Hint. add e into map as key, with the Dummy object PRESENT as value.
	// Hint. look Map API for the return type of put
	public boolean add(E e) {
		if(map.containsKey(e)) {
			return false;
		}
		map.put(e, PRESENT);
		return true;
	
		// COMPLETE THIS
	
	}
	
	@Override
	public boolean remove(E o) {
		if(map.containsKey(o)) {
			map.remove(o);
			return true;
		}
		else {	
		
		return false;
		}
	
		// COMPLETE THIS
	}

	@Override
	public void clear() {
		// COMPLETE THIS
		this.map=new HashMap<>();
		
	}
	@Override
	public int size() {
		return map.size();
	}
	

	
	//Other methods, such as the following size(), isEmpty(), addAll(), toString()  are inherited from MyAbstractSet
     
	    
	 


}
