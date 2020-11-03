import java.util.Scanner;

public class EjercicioEnClase04 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Octubre 31 del 2020                  |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  CONDICIONALES: Ejemplo # 2                  |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("Ingrese sus notas para calcular su nota definitiva");
		
		String nombre;
		double a=0;
		double b=0;
		double c=0;
		double d=0;
		double e=0;
		double f=0;
	
		
		
		
		System.out.println();
		System.out.println("Digite el nombre del empleado ");
		System.out.print(" --->>"); nombre= teclado.nextLine();
		
		System.out.println();
		System.out.println("Digite el salario ");
		System.out.print(" --->>"); a= in.nextInt();
		
		System.out.println();
		System.out.println("Digite el descuento a realizar");
		System.out.print(" --->>"); b= in.nextInt();
		
		
		c=a-b;
	
		
		
		System.out.println("-----------------------------------");
		System.out.println("+        DATOS DEL EMPLEADO       +");
		System.out.println("-----------------------------------");
		System.out.println("Nombre del empleado: "+ nombre      );
		System.out.println();
		System.out.println("El salario debengado es: "+a        );
		System.out.println();
		System.out.println("Digite el descuento a realizar:"+ b );
		System.out.println();
		System.out.println("El valor total a pagar es: "+ c     );
		
	
	

	}

}
