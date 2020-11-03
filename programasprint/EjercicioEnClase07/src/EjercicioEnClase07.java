import java.util.Scanner;

public class EjercicioEnClase07 {
		public static void main(String[] args) {
			Scanner in= new Scanner(System.in);
			Scanner teclado = new Scanner(System.in);

			
			System.out.println("+------------------------------------------------------------------------+");
			System.out.println("|  AUTOR: Angel Yesid Guetio                                             |");
			System.out.println("|  FECHA: Octubre 31 del 2020                                            |");
			System.out.println("+------------------------------------------------------------------------+");
			System.out.println("|  TRABAJO EN CLASE: EJERCICIO 07                                            |");
			System.out.println("+------------------------------------------------------------------------+");
			System.out.println("");
			
			String nombre;
			
			int numeroDetrabajadores=0;
			int contador=1;
			int horasLaboradas=0;
			int horasExtras=0;
			int valorPorHora=0;
			
			int HorasNormales=0;
			int valorDeHoraExtra=0;
			int horaNormal=0;
			int PSinDescuento=0;
			
			int porcentajeDeHoraExtra= 50;
			int porcentajeDescuento=12;
			int vvalorDeHoraExtra;
			int pagoDeHorasExtras=0;
			int pagoDeHoraNormal=0;
			int pagocondescuento=0;
			int totalPago=0;
			int cien =100;
			
			
			
			
			
			
			
		
			System.out.println("Numero de trabajadores");
			System.out.print(" --->>");numeroDetrabajadores= in.nextInt();
			
			

			while (contador<=numeroDetrabajadores) {
				
				
				
				System.out.println("Nombre del trabajador "+contador);
				System.out.print(" --->>");nombre=teclado.nextLine();
				System.out.println("Horas laboradas "+contador);
				System.out.print(" --->>");horasLaboradas= in.nextInt();
				System.out.println("Valor de la hora lavorada"+contador);
				System.out.print(" --->>");valorPorHora= in.nextInt();
				System.out.println("Horas extras laboradas "+contador);
				System.out.print(" --->>");horasExtras= in.nextInt();
				contador++;
		
				HorasNormales= horasLaboradas-horasExtras;
				
				valorDeHoraExtra= (valorPorHora* porcentajeDeHoraExtra)/cien;
				
				vvalorDeHoraExtra=valorDeHoraExtra+valorPorHora;
				
				pagoDeHorasExtras=vvalorDeHoraExtra*horasExtras;
				
				pagoDeHoraNormal=HorasNormales*2000;
				
				PSinDescuento= pagoDeHoraNormal+pagoDeHorasExtras;
				
				pagocondescuento=(PSinDescuento*porcentajeDescuento)/cien;
				
				totalPago=PSinDescuento-pagocondescuento;
			
			if (horasExtras>0) {
				System.out.println("Nombre del trabajador:   " +nombre        );
				System.out.println("Horas laboradas:         " +horasLaboradas);
				System.out.println("Horas extras laboradas:  " +horasExtras  );
				System.out.println("Valor de hora laborada:  " +valorPorHora);
				System.out.println();
				System.out.println("Valor de hora extra                      : " +vvalorDeHoraExtra);
				System.out.println("Pago de las "+horasExtras+" horas extras               : " +pagoDeHorasExtras);
				System.out.println("Pago de  "+HorasNormales+" horas normales               : " +pagoDeHoraNormal);
				System.out.println("Total devengado sin descuento            : " +PSinDescuento);
				System.out.println("Descuento del 12% seguro social          : " + pagocondescuento);
				System.out.println("Valor total devengado                    : " + totalPago);
				
				
			}else {
				System.out.println("Nombre del trabajador:   " +nombre        );
				System.out.println("Horas laboradas:         " +horasLaboradas);
				System.out.println("Horas extras laboradas:  " +horasExtras  );
				System.out.println("Valor de hora laborada:  " +valorPorHora);
				System.out.println();
				System.out.println("Valor de hora extra                      : " +horasExtras);
				System.out.println("Pago de las "+horasExtras+" horas extras               : " +0);
				System.out.println("Pago de  "+HorasNormales+" horas normales               : " +pagoDeHoraNormal);
				System.out.println("Total devengado sin descuento            : " +pagoDeHoraNormal+horasExtras);
				System.out.println("Descuento del 12% seguro social          : " + (pagoDeHoraNormal*12)/100);
				System.out.println("Valor total devengado                    : " + (pagoDeHoraNormal-(pagoDeHoraNormal*12)/100));
				
			}	
				
				
				
		
			}
			
			
		
		}
}
