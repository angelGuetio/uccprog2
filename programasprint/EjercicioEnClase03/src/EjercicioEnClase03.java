import java.util.Scanner;


public class EjercicioEnClase03 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Octubre 31 del 2020                  |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  CONDICIONALES: Ejemplo # 2                  |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("Ingrese sus notas para calcular su nota definitiva");
		
		double a=0;
		double b=0;
		double c=0;
		double d=0;
		double e=0;
		double f=0;
		double g=0;
	
	
		System.out.println();
		System.out.println("Digite el primer numero");
		System.out.print(" --->>"); a= in.nextDouble();
		System.out.println("Digite el segundo numero");
		System.out.print(" --->>"); b= in.nextDouble();
		System.out.println("Digite el primer numero");
		System.out.print(" --->>"); c= in.nextDouble();
		
		
		d= a*0.3;
		e= b*0.3;
		f= c*0.4;
		g= (d + e +f);
		
		System.out.println();
		System.out.println("Nota 01: "+a);
		System.out.println("Nota 02: "+b);
		System.out.println("Nota 03: "+c);
		System.out.println();
		System.out.println("La nota definitiva es: "+g);
		
		
	}		
}
