package contenedor;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestaTest {

	@Test
	public void test() {
		System.out.println("Suma de enteros...");
		Resta s=new Resta(2,3);
		assertTrue(s.restar()==-1);
	}

}
