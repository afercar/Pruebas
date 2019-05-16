package contenedor;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicarTest {

	@Test
	public void test() {
		System.out.println("Suma de enteros...");
		Multiplicar s=new Multiplicar(2,3);
		assertTrue(s.multiplicar()==6);
	}

}
