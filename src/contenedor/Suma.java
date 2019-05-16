package contenedor;

public class Suma {

	private double num1;
	private double num2;
	
	
	public Suma(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double sumar() {
		return num1+num2;
	}

}
