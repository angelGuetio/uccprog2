package ejercicioswitch1;

import java.util.Scanner;

public class ejercicioswitch1 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando el switch en java: Ejemplo # 2     |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("Ingrese sus notas para calcular su nota definitiva");
		
		String nombre;
		double a=0;
		int b;
		double c=0;
		
		System.out.println();
		System.out.println("Digite el nombre del empleado ");
		System.out.print(" --->>"); nombre= teclado.nextLine();
		
		System.out.println();
		System.out.println("Digite el salario ");
		System.out.print(" --->>"); a= in.nextDouble();
		
		System.out.println();
		System.out.println("1. 15% \n 2. 10% \n 3. 8% \n 3. 7% ");
		System.out.println("Digite la categoria");
		System.out.print(" --->>"); b= in.nextInt();
		System.out.println();
		
		switch (b) {
		case 1:
			System.out.println("el nombre es: "+nombre);
			System.out.println("El salario devengado es: "+a*1.15);
			break;
		case 2:
			System.out.println("el nombre es: "+nombre);
			System.out.println("El salario es: "+a*1.10);
			break;
			
		case 3:
			System.out.println("el nombre es: "+nombre);
			System.out.println("El salario es: "+a*1.08);
			break;
		
		case 4:
			System.out.println("el nombre es: "+nombre);
			System.out.println("El salario es: "+a*1.07);
			break;	
			
			
		default :
			System.out.println("la categoria seleccionada no existe ");
			
			break;
		}
					
	}

}
