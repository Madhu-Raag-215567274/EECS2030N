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
    	 map = new TreeMap<>();
    	// COMPLETE THIS
    }
    
    
    // addAll
	@Override
    public Iterator<E> iterator(){
		return map.keySet().iterator();
		// COMPLETE THIS
    }
       
	@Override
	public boolean contains(E o) {
		return map.containsKey(o);
		// COMPLETE THIS
	}
	
	@Override
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
		map = new TreeMap<>();
		
	}
	@Override
	public int size() {
		return map.size();
	}
	
	
	
	 

}
