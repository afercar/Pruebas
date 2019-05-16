package contenedor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime que operacion quieres realizar operaciones posibles (+ - * /)");

		String respuesta=sc.nextLine();

		System.out.println("Dime el primer numero de la operacion");

		int n1=sc.nextInt();

		System.out.println("Dime el segundo numero de la operacion");

		int n2=sc.nextInt();

		Suma s = new Suma(n1, n2);

		Resta r = new Resta(n1, n2);

		Multiplicar m = new Multiplicar(n1,n2);

		Division d = new Division(n1,n2);

		if(respuesta.equals("+")) {			

			System.out.println("El resultado de la suma es " + s.sumar());

		}else if(respuesta.equals("-")){			

			System.out.println("El resultado de la resta es " + r.restar());

		}else if(respuesta.equals("*")) {			

			System.out.println("El resultado de la multiplicacion es " + m.multiplicar());

		}else if(respuesta.equals("/")){			

			System.out.println("El resultado de la division es " + d.division());

		}else {

			System.out.println("Esa operacion no existe");

		}

	}

}
