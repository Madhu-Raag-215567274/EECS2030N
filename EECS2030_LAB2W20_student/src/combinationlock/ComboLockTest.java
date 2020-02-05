package combinationlock;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ComboLockTest {

	@Test
	public void exceptionTest() {
		int secret1=10;
		int secret2=20;
		int secret3=30;
		
		
		ComboLock a=new ComboLock(secret1, secret2, secret3);
		try {
			int ticks =55;
			a.turnRight(ticks);
			fail("Throw IllegalArgumentExcepion");
		}
		catch(IllegalArgumentException e) {
			// good 
		}
		catch (Exception w) {
			fail ("Wrong kind of exception");
		}
		
		try {
			int ticks =55;
			a.turnLeft(ticks);
			fail("Throw IllegalArgumentExcepion");
		}
		catch(IllegalArgumentException e) {
			// good 
		}
		catch (Exception w) {
			fail ("Wrong kind of exception");
		}
	}
	@Test
	public void correctCombo() {
		int secret1=10;
		int secret2=20;
		int secret3=30;
		ComboLock v=new ComboLock(secret1, secret2, secret3);
		
	  v.turnRight(10);
	  assertEquals(10,v.getCurrentNumber() );
	  v.turnLeft(20);
	  assertEquals(20,v.getCurrentNumber() );
	  v.turnRight(30);
	  assertEquals(30,v.getCurrentNumber() );
	 
	  assertTrue(v.open()==true);
	  
	}
	@Test
	public void wrongCombo() {
		int secret1=10;
		int secret2=20;
		int secret3=30;
		ComboLock m=new ComboLock(secret1, secret2, secret3);
		m.turnLeft(10);
		m.turnRight(20);
		m.turnLeft(30);
		assertEquals(false, m.open());
		m.reset();
		m.turnRight(10);
		m.turnLeft(31);
		m.turnRight(30);
		assertEquals(false, m.open());	
		m.reset();
		m.turnRight(10);
		m.turnRight(31);
		m.turnRight(30);
		assertEquals(false, m.open());
		m.reset();
		m.turnLeft(10);
		m.turnLeft(31);
		m.turnLeft(30);
		assertEquals(false, m.open());
		
	}
	@Test
	public void resetTest() {
		int secret1=10;
		int secret2=20;
		int secret3=30;
		ComboLock l=new ComboLock(secret1, secret2, secret3);
		l.turnLeft(10);
		l.turnLeft(31);
		l.turnLeft(30);
		l.reset();
		assertEquals(0,l.getlockState() );
		
	}
	@Test
	public void moreThanThreeEntries() {
		int secret1=10;
		int secret2=20;
		int secret3=30;
		ComboLock p=new ComboLock(secret1, secret2, secret3);
		p.turnLeft(10);
		p.turnRight(31);
		p.turnLeft(32);
		p.turnLeft(14);
		p.turnRight(11);
		p.turnLeft(9);
		assertFalse(p.open()==true);
	}
	
	

}
