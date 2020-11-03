import java.util.Scanner;

public class EjercicioEnClase02 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Octubre 31 del 2020                  |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  CONDICIONALES: Ejemplo # 2                  |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("Calvin neceita realizar un programa programa  quelea 2 numero y determine l suma, resta, el prducto y el promedio");
		
		double a=0;
		double b=0;
		double c=0;
		double d=0;
		double e=0;
		double f=0;
			
		System.out.println();
		System.out.println("Digite el primer numero");
		System.out.print(" --->>"); a= in.nextInt();
		System.out.println("Digite el segundo numero");
		System.out.print(" --->>"); b= in.nextInt();
		
		c= a+b;
		d= a-b;
		e= a*b;
		f= c/2;
		
		System.out.println("RESULTADO DE LAS OPERACIONES");
		System.out.println();
		System.out.println("numeros a operar: "+a+ " y " +b);
		
		System.out.println("la suma  de los dos numeros ingresados es: "+c);
		System.out.println("La resta de los dos numeros ingresados es: "+d);
		System.out.println("La multiplicación de los dos numeros ingresados e: "+e);
		System.out.println("El promedio de los numeros ingresados es: "+f);
		
	}
}
