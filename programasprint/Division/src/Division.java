import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		
	
		Scanner in= new Scanner(System.in);
		
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("| Autor: Angel Yesid Guetio                                 |");
		System.out.println("| Fecha: 24/Octubre 2020                                    |");
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("| Programa : Division entrada de numeros por teclado        |");
		System.out.println("+-----------------------------------------------------------+");
		System.out.println();
		
		double a=0;
		double b=0;
		double c=0;
		
		c=(a/b);
		
		System.out.println("Digite un numero:");
		a=in.nextInt();

		System.out.println("Digite un numero:");
		b=in.nextInt();
		
		System.out.println("El resultado es: "+ (a/b));
		
	}
}
