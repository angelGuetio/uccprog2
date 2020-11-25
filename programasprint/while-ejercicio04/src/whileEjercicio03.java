import java.util.Scanner;

public class whileEjercicio03 {
	public static void main(String[] args) {
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando Bucles: Ejemplo # 2                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("NUMERO CAPICUA");
		System.out.println("");
		
		
		
			Scanner leer = new Scanner(System.in);  //leer
			
		     int contador,primo,numero;

		     System.out.print("Ingresa un numero: ");
		     numero = leer.nextInt();

		     contador = 0;

		     for(primo = 1; primo <= numero; primo++)
		     {
		         if((numero % primo) == 0)
		         {
		             contador++;
		         }
		     }

		     if(contador <= 2)
		     {
		         System.out.println(numero+ " si es numero primo");
		     }else{
		         System.out.println("El numero no es primo");
		     }
		
		

	}

}
