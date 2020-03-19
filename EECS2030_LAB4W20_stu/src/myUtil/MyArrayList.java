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
		if(this.elementData[this.elementData.length-1]!=null) {
			E [] temp = (E[])new Object [this.elementData.length];			
			for(int i=0;i<this.elementData.length;i++) {
				temp[i] =this.elementData[i];
			}
			this.elementData = (E[])new Object [temp.length+DEFAULT_CAPACITY];
			for(int i=0;i<temp.length;i++) {
				this.elementData[i]=temp[i];
			}
		}
			
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
		size=0;
		boolean q=true;
		for(int i =0;i<this.elementData.length&& q;i++) {
			if(elementData[i]==null) {
				q=false;
			}else {
				this.size++;
			}
		}
		boolean p=true;
		int counter=-1;
		for(int i =0; i<this.elementData.length && p;i++) {
			if(this.elementData[i]==o) {
				counter =i;
				p=false;
			}
		}
		
		int index=counter;
		if(counter ==-1) {
			
		}
		else {
			if(index==this.elementData.length-1) {
				this.elementData[this.elementData.length-1]=null;
			}
			else {
			this.elementData[counter]=null;
			for(int i= counter;i<this.elementData.length-1;i++) {
				this.elementData[i]=this.elementData[i+1];
			}
			this.elementData[this.elementData.length-1]=null;
			
		}
	  }
		size--;
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		
		return this.elementData[index];
	}

	@Override
	public E set(int index, E element) {
		if(index>this.elementData.length-1 || this.elementData[index]==null ) {
			throw new IndexOutOfBoundsException();
		}
		E p = this.elementData[index];
		this.elementData[index]=element;
		// TODO Auto-generated method stub
		
		return p ;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		size=0;
		boolean q=true;
		for(int i =0;i<this.elementData.length&& q;i++) {
			if(elementData[i]==null) {
				q=false;
			}else {
				this.size++;
			}
		}
		
		
	E p= elementData[index];
		int counter=index;
		
		if(index==this.elementData.length-1) {
		
			this.elementData[counter]=element;
			this.elementData[this.elementData.length] =p;
		}
		else {
		
			
			
		for(int i=this.elementData.length-1 ;i>counter;i--) {			
			this.elementData[i]=this.elementData[i-1];	
			 
			
		}

		this.elementData[index]=element;
		}
	
			
		
	  
		size++;
		
		
	}

	@Override
	public E remove(int index) {
		if(elementData[index]==null) {
			throw new IndexOutOfBoundsException();
		}
		size=0;
		boolean q=true;
		for(int i =0;i<this.elementData.length&& q;i++) {
			if(elementData[i]==null) {
				q=false;
			}else {
				this.size++;
			}
		}
		E p= (elementData[index]);
		int counter=index;
	//	index=counter;
		
		if(index==this.elementData.length-1) {
				this.elementData[this.elementData.length-1]=null;
			}
			else {
			this.elementData[counter]=null;
			for(int i= counter;i<this.elementData.length-1;i++) {
				this.elementData[i]=this.elementData[i+1];
			}
			this.elementData[this.elementData.length-1]=null;
			
		}
	  
		size--;
		
		// TODO Auto-generated method stub
		return p;
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
