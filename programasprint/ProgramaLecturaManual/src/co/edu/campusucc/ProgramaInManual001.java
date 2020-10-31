package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaInManual001 {
	public static void main(String[] args) {
		System.out.println("+------------------------------------------+");
		System.out.println("| Autor: Angel Yesid Guetio                |");
		System.out.println("| Fecha: 24/Octubre 2020                   |");
		System.out.println("+------------------------------------------+");
		System.out.println("| Programa Entrada Manual: Captura teclado |");
		System.out.println("+------------------------------------------+");
		System.out.println();
		System.out.println();
		
		String numero="";
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite un numero:");
		numero = scan.next();
		
		System.out.println("El numero Digitado es:"+numero);
		
	}
}
