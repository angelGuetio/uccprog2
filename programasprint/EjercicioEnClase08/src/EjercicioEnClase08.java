import java.util.Scanner;

public class EjercicioEnClase08 {
	public static void main(String[] args) {
		Scanner digitos= new Scanner(System.in);
		
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                                             |");
		System.out.println("|  FECHA: Octubre 31 del 2020                                            |");
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("|  TRABAJO EN CLASE: EJERCICIO 08                                        |");
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("");
		
	
		System.out.println("Ingre un numero");
		int num=digitos.nextInt();
		String numero=Integer.toString(num);
		System.out.println("El numero "+num+" tiene "+numero.length()+" digitos");
	}
		
	

}
