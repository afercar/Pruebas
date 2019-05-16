package contenedor;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void test() {
		System.out.println("Division de enteros...");
		Division s=new Division(8,2);
		assertTrue(s.division()==4);
	}
	@Test
	public void test2() {
		System.out.println("Division de enteros...");
		Division s=new Division(8,0);
		assertTrue(s.division()==-9517521);
	}
}
