import java.util.Scanner;

public class whileEjercicio06 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando Bucles: Ejemplo # 6                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println(" NUMEROS PRIMOS");
		System.out.println("");
		
		
		int contador,I,numero;
		
		System.out.println("Ingrse un numero");
		numero= s.nextInt();
		contador=0;
		
		for(I=1; I <=numero; I++) {
			if ((numero % I)==0) {
				contador++;
				
			}
		}
		
		if(contador<=2) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}
	
	
	}

}
