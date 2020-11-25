package ultimo;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class ultimo {
	public static void main(String[] args) {
		
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 24 del 2020                  |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Ejecución de todos los trabajos              |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
	
	 	   int opcion;
	 	   char put;
		   String comando = "", ruta="D:\\programas\\";
		  
		   Scanner can = new Scanner(System.in); 
		
		   System.out.println("--------------------------------------------");
		   System.out.println("|         ESTE ES EL MENU PRINCIPAL        |");
		   System.out.println("--------------------------------------------");

		   System.out.println("Digite 1 para el programa Division");
		   System.out.println("Digite 2 para el programa Ejercicio_01");
		   System.out.println("Digite 3 para el programa EjercicioEnClase07");
		   System.out.println("Digite 4 para el programa EjercicioEnClase10");
		   System.out.println("Digite 5 para el programa ejercicioswitch1");
		   System.out.println("Digite 6 para el programa ejercicioswitch2");
		   System.out.println("Digite 7 para el programa ejercicioswitch3");
		   System.out.println("Digite 8 para el programa ejercicioswitch4");
		   System.out.println("Digite 9 para el programa liquidacion");
		   System.out.println("Digite 10 para el programa Multiplicacion");
		   System.out.println("Digite 11 para el programa Resta");
		   System.out.println("Digite 12 para el programa Suma");
		   System.out.println("Digite 13 para el programa whileEjercicio01");
		   System.out.println("Digite 14 para el programa whileEjercicio02");
		   System.out.println("Digite 15 para el programa whileEjercicio03");
		   System.out.print("Ingrese el numero del programa que desea ejecutar: ");
		   opcion=can.nextInt();
		    
		   switch (opcion) {
		   case 1:
			   comando = "Division";
			   break;
		   case 2:
			   comando = "Ejercicio_01";
			   break;
		   case 3:
			   comando = "EjercicioEnClase07";
			   break;
		   case 4:
			   comando = "EjercicioEnClase10";
			   break;
		   case 5:
			   comando = "ejercicioswitch1";
			   break;
		   case 6:
			   comando = "ejercicioswitch2";
			   break;
		   case 7: 
			   comando = "ejercicioswitch3";
			   break;
		   case 8:
			   comando = "ejercicioswitch4";
			   break;
		   case 9:
			   comando = "liquidacion";
			   break;
		   case 10:
			   comando = "Multiplicacion";
			   break;
		   case 11:
			   comando = "Resta";
			   break;
		   case 12:
			   comando = "Suma";
			   break;
		   case 13:
			   comando = "whileEjercicio01";
			   break;
		   case 14:
			   comando = "whileEjercicio02";
			   break;
		   case 15:
			   comando = "whileEjercicio03";
			   break;
		   
			   
		   }
		   
		   try
		    
		   { 
			  
			   var processBuilder = new ProcessBuilder();
			   processBuilder.command("java","D:\\programas\\" +comando+ ".java");
			   var process = processBuilder.inheritIO().start();
			   var ret = process.waitFor();
			   				   
		   }
		   
		   catch (Exception e)
		   {
			   System.out.println(e);
		   }
		   System.out.println("Deseas volver al menu principal S/N");
			put=can.next().charAt(0);
			while(put=='s'||put=='s');
			

		
		
		
		
		
	}

}
