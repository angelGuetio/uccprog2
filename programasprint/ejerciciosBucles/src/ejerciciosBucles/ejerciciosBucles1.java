package ejerciciosBucles;

import java.util.Scanner;

public class ejerciciosBucles1 {
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando el switch en java: Ejemplo # 2     |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("COBRO DE TARIFA POR CONCEPTO DE CARNET UNIVERSIDAD DE VIDA");
		
		
		String entrada;
		int numero=0;
		
		
		System.out.println();
		System.out.println("Escriba s o n y oprima enter para continuar");
		System.out.print(" --->>"); entrada= teclado.nextLine();
	
		while("s"!="n") {
			
			if ((entrada=="S")|(entrada=="s")){
				System.out.println("la letra digitada es:"+numero);
			}else if ((entrada=="N")|(entrada=="n")){
				System.out.println("la letra digitada es: "+numero);
			}
			numero++;
		
		}
	}

}
