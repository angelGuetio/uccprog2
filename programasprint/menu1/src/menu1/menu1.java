package menu1;
import java.util.Scanner;

public class menu1 {
	
	public static void main(String[] args) {
		
	System.out.println("Division");
	System.out.println("digite 1 para programa Ejercicio01");
	
	try (Scanner scan = new Scanner(System.in)){
		int opcionprograma;
		String comando ="";
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Ingrese el numero del programa a ejecutar: ==> ");
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
				System.out.println(" El programa no ha sido asignado");
				e.printStackTrace();
			}
			
		   
		
			}
		}

	}
}


	
	


