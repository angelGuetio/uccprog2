import java.util.Scanner;

public class EjercicioEnClase09 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                                             |");
		System.out.println("|  FECHA: Octubre 31 del 2020                                            |");
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("|  TRABAJO EN CLASE: EJERCICIO 09                                        |");
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("");
		
		String nombre;
		
		int numeroDetrabajadores=0;
		int contador=1;
		int codigo=0;
		int horaLaboradas=0;
		int valorPorHora=0;
		int total=0;
		int pago=0;
		
		//
		int HorasExtras=0;
		int netoHoraExtra=0;
		int total2=0;
		int fin=0;
		int p=0;
		
		HorasExtras=((valorPorHora*20)/100);
		netoHoraExtra=valorPorHora+HorasExtras;
		
		System.out.println("Numero de trabajadores");
		System.out.print(" --->>");numeroDetrabajadores= in.nextInt();
		
		

		while (contador<=numeroDetrabajadores) {
			
			
			System.out.println("Nombre del trabajador "+contador);
			System.out.print(" --->>");nombre=teclado.nextLine();
			System.out.println("Codigo "+contador);
			System.out.print(" --->>");codigo= in.nextInt();
			System.out.println("Valor de la hora lavorada"+contador);
			System.out.print(" --->>");valorPorHora= in.nextInt();
			System.out.println("N°.Horas laboradas"+contador);
			System.out.print(" --->>");horaLaboradas= in.nextInt();
			contador++;
	

			HorasExtras=((valorPorHora*20)/100);
			netoHoraExtra=valorPorHora+HorasExtras;
			total= horaLaboradas-48;
			total2= total*netoHoraExtra;
			pago=horaLaboradas-total;
			fin=pago*valorPorHora;
			p=fin+total2;
					
			if(horaLaboradas>48) {
				System.out.println("codigo: "+codigo);
				System.out.println("Nombre: "+nombre);
				System.out.println("Numero de horas laboradas : "+horaLaboradas);
				System.out.println("valor de la hora normal   : "+valorPorHora);
				System.out.println("valor de la hora extra    : "+ netoHoraExtra);
				System.out.println("Total pago extras         : "+total2);
				System.out.println("Total pago normal         : "+fin);
				System.out.println("Total devengado           : "+p);
				
				System.out.println("");
				
			}else  if ( horaLaboradas<48) {
				System.out.println("codigo: "+codigo);
				System.out.println("Nombre: "+nombre);
				System.out.println("Numero de horas laboradas : "+horaLaboradas);
				System.out.println("valor de la hora normal   : "+valorPorHora);
				System.out.println("valor de la hora extra    : "+ 0);
				System.out.println("Total devengado           : "+valorPorHora*horaLaboradas);					
				System.out.println("");
		
					
			}
		            
			
			
		}
		
		
	
	}

}
