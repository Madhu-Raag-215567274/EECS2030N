package bookStore;

import java.util.Comparator;

public abstract class SortBooksbyYear implements Comparator<Book> {
	
	
	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getYearPublished()>o2.getYearPublished()) {
			return 1;
		}
		else if(o1.getYearPublished()<o2.getYearPublished()) {
			return -1;
		}
		else {
			return 0;
		}
		// TODO Auto-generated method stub
			}

}
