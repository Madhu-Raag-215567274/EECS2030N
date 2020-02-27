package myUtil;

public class MyArrayList<E> implements MyList<E> {

	private static final int DEFAULT_CAPACITY = 10;
	
	int size;  // non-private for testing purpose
	E [] elementData; // non-private for testing purpose
	
	/**
	 * Create an empty list of capacity capa
	 * 
	 * @param capa the initial capacity. Assume greater than 0.
	 */
	@SuppressWarnings({"unchecked"})
    public MyArrayList(int capa) {
		this.elementData = (E[])new Object [capa];
		this.size=0;
	}

	/**
	 * Create an empty list of default capacity
	 * 
	 */
    @SuppressWarnings({"unchecked"})
    public MyArrayList() {
		this.elementData = (E[])new Object [DEFAULT_CAPACITY];
		this.size=0;
	}
    public int size() {
    	//this.size=this.elementData.length;
    	
    	return size;
    }
    public boolean isEmpty() {
    	//boolean p=true;
    	for(int i=0;i<this.elementData.length ;i++) {
    		if(this.elementData[i]!=null) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public boolean contains(E o) {
   	

    	
    	int counter=0;   
    
  
    	for (int i =0;i<this.elementData.length;i++) {
      		if(this.elementData[i]==(o)) {
    			counter =1;
    		}
    	}
    	if(counter ==1) {
    		return true;
    	}
		return false;
    	
    }

	@Override
	public void add(E o) {
			
		int counter=0;
		boolean p=true;
		size=0;

	
		for(int i=0;i<this.elementData.length && p;i++) {
			if(this.elementData[i]== null) {
			this.elementData[i]=o;
			p=false;
			counter++;
			}
			this.size++;
			
		}
			
			
	
	}

	@Override
	public void remove(E o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return this.elementData[index];
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E o) {
		boolean p=true;
		int counter=-1;
		for(int i =0; i<this.elementData.length && p;i++) {
			if(this.elementData[i]==o) {
				counter =i;
				p=false;
			}
		}
		
		return counter;
	}

	@Override
	public int lastIndexOf(E o) {
		// TODO Auto-generated method stub
		int counter=-1;
		for(int i =0; i<this.elementData.length ;i++) {
			if(this.elementData[i]==o) {
				counter =i;
			
			}
		}
		
		return counter;
	}
    
    
    
   
    

}
