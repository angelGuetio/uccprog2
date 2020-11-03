
import java.util.Scanner;

public class EjercicioEnClase10 {
		
			static Scanner entrada = new Scanner(System.in);
			public static void main(String[] args) {
			
			System.out.println("+------------------------------------------------------------------------+");
			System.out.println("|  AUTOR: Angel Yesid Guetio                                             |");
			System.out.println("|  FECHA: Octubre 31 del 2020                                            |");
			System.out.println("+------------------------------------------------------------------------+");
			System.out.println("|  TRABAJO EN CLASE: EJERCICIO 09                                        |");
			System.out.println("+------------------------------------------------------------------------+");
			System.out.println("");
			
			
			int numero;
			
			System.out.println("por favor, ingrese un numero ");
			System.out.print(" --->>");numero= entrada.nextInt();
			
			if(numero<0) {
				System.out.println("el numero es" + numero +" y su valor absoluto es "+ Math.abs(numero));
				
			}
			else {
				System.out.println("El numero es "+ numero);
			}
			
		}
}
