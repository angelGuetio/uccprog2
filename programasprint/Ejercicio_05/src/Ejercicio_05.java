import java.util.Scanner;

public class Ejercicio_05 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("+----------------------------------------------------+");
		System.out.println("| Autor: Angel Yesid Guetio                          |");
		System.out.println("| Fecha: 24/Octubre 2020                             |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("| Programa : Operadores logicos   05                 |");
		System.out.println("+----------------------------------------------------+");
		System.out.println();
		
		int a=0;
		int b=0;
		

		boolean c= (a==1 & b==1);
		boolean d= (a==0 & b==1);
		boolean e= (a==1 & b==0);
		boolean f= (a==0 && b==0);
				
		System.out.println("�La tierra es un sat�lite [0] falso // [1] verdadero?");
		a=in.nextInt();

		System.out.println("� Azul es una obra literaria de Ruben Dario [0] falso // [1] verdadero?");
		b=in.nextInt();
		
		if (a==1 & b==1) {
			System.out.println("El valor de la variable K es: "+(a==1 & b==1));
		}
		else if (a==1 & b==0) {
			System.out.println("El valor de la variable K es: "+(e));
		}
		else if (a==0 & b==1) {
			System.out.println("El valor de la variable K es: "+(d));
		}
		else if (a==0 && b==0){
			System.out.println("El valor de la variable K es: "+(f));
		}
		else if (a!=1) {
			System.out.println("--->>El numero digitado es incorrecto<<--- ");
		}
		else if (b!=1) {
			System.out.println("--->>El numero digitado es incorrecto<<--- ");
		}
	}

}
