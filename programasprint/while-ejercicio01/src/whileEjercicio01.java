import java.util.Scanner;

public class whileEjercicio01 {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando Bucles: Ejemplo # 1                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("INVIRTIENDO UN NUMERO");
		System.out.println("");
		
	
		int numero,invertido=0,resto;
		
		System.out.println("Indtruduce un munero mayor a dos cifras 123");
		numero=s.nextInt();
		
		while(numero>0) {
			
			resto=numero%10;
			invertido=invertido*10+resto;
			numero/=10;

		}
		System.out.println();
	
		System.out.println("Numero invertido: "+invertido);
		
	}

}
