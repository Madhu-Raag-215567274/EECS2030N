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
    	 map = new LinkedHashMap();
    }
    
    /**
	 * Create an empty set of default capacity
	 * 
	 */
    public MyLinkedHashSet(int initialCapacity) {
    	 map = new LinkedHashMap<>(initialCapacity);
    	// COMPLETE THIS
    }
    
    
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
		 map = new LinkedHashMap();
		// COMPLETE THIS
	}
	@Override
	public int size() {
		return map.size();
	}
	
	
	
	 
}
