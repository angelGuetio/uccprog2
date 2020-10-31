import java.util.Scanner;

public class Ejercicio_02 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("+----------------------------------------------------+");
		System.out.println("| Autor: Angel Yesid Guetio                          |");
		System.out.println("| Fecha: 24/Octubre 2020                             |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("| Programa : Operadores logicos   02                 |");
		System.out.println("+----------------------------------------------------+");
		System.out.println();
		
		int a= 10;
		int b= 18;
		int s;
		int s1;
		
		System.out.println("valor de las variables");
		System.out.println();
		System.out.println("a=10");
		System.out.println("b=18");
		System.out.println();
		System.out.println("s = a < b");
		System.out.println("s1 = a <= b");
		System.out.println();
	
		if (a<b) {
			System.out.println("El valor final de S es: "+(a<b));	
		}
	
		if (a<=b) {
			System.out.println("El valor final de S1 es: "+(a<=b));
		}
		
		
	}

}
