import java.util.Random;


public class explicacion_while3 {
	public static void main(String[] args) {
	
	
		
	
	System.out.println("+-----------------------------------------------------------------+");
	System.out.println("|  AUTOR: Angel Yesid Guetio                                      |");
	System.out.println("|  FECHA: Noviembre 14 del 2020                                   |");
	System.out.println("+-----------------------------------------------------------------+");
	System.out.println("|  Etrucruras de repetición en java numero primo: Ejemplo # 2     |");
	System.out.println("+-----------------------------------------------------------------+");
	System.out.println("");
	
	int a=0,i ;
	Random aleatorio= new Random();
	int numero= aleatorio.nextInt(1000);
	System.out.println("El numero es: "+numero);
	
	for (i=1;i<=numero;i++) {
		if(numero % i ==0) {
			a++;
		}
		
	}
	if(a!=2) {
		
		
		
	
	}else  {
		System.out.println("si es primo");
	
	}

	
	
	}

}
