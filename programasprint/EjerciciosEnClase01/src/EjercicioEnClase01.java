
import java.util.Scanner;

public class EjercicioEnClase01 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Octubre 31 del 2020                  |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  CONDICIONALES: Ejemplo # 1                  |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("Calvin neceita realizar un programa algoritmico quelea un numero y determine su cubo");
		
		double a=0;
		double b=0;
		
			
		System.out.println();
		System.out.println("Digite un numero para determinar su cubo");
		System.out.print(" --->>"); a= in.nextInt();
		
		b= Math.pow(a,3);
		
		System.out.println("El cubo de este numero es: "+b);
		
		
		
		
	}

}
