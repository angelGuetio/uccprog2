import java.util.Random;


public class explicacion_while5 {
	public static boolean esPrimo(int numero){
		
		
		
		System.out.println("+----------------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                         |");
		System.out.println("|  FECHA: Noviembre 14 del 2020                      |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|  Etrucruras de repetición en java: Ejemplo # 2     |");
		System.out.println("+----------------------------------------------------+");
		System.out.println();
		
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
			
		
		
		
		
	}
	
	
}