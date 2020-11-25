package co.edu.campusucc;

import java.util.Scanner;

public class menu {
	
	
	public static void main(String[] args) {
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|               MENU PRINCIPAL                 |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("INVIRTIENDO UN NUMERO");
		System.out.println("");
		
		
		
		
		

		
				
				System.out.println("digite 1 para programa Division");
				
				try (Scanner scan = new Scanner(System.in)){
					int opcionprograma;
					String comando ="";
					System.out.println("ingrese el numero del programa a ejecutar: ");
					opcionprograma = scan.nextInt();
					
					switch (opcionprograma) {
					case 1 :
						new Division().main(args);
						break;
						default :
							
					    try 
						{
						Runtime.getRuntime().exec(comando);
						}
						catch (Exception e)
						{
							System.out.println("Error en el metodo exec () ");
							e.printStackTrace();
						}
						
					   
					
				}
				}

			}

		}
