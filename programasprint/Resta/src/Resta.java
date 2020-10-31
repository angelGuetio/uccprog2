import java.util.Scanner;

public class Resta {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("| Autor: Angel Yesid Guetio                                 |");
		System.out.println("| Fecha: 24/Octubre 2020                                    |");
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("| Programa : Resta entrada de numeros por teclado           |");
		System.out.println("+-----------------------------------------------------------+");
		System.out.println();
		
		int a=0;
		int b=0;
		int c=0;
		
		c=a-b;
		
		System.out.println("Digite un numero:");
		a=in.nextInt();

		System.out.println("Digite un numero:");
		b=in.nextInt();
		
		System.out.println("El resultado es "+(a-b));
		
	}
}
