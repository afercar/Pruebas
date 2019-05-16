package contenedor;

public class Division {

	private double num1;
	private double num2;
	
	
	public Division(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	public double division() {
		if(num2==0) {
			System.out.println("No se puede");
			return -9517521;
		}
		else {
			return num1/num2;
		}
		
	}



}
