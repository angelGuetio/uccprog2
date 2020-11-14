package ejercicioswitch3;

import java.util.Scanner;

public class ejercicioswitch3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Scanner teclado=new Scanner(System.in);
		Scanner scan =new Scanner(System.in);
		
		int ubicacion;
		int red;
		int pre,pre1,pre2,pre3;
		int time;
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando el switch en java: Ejemplo # 3     |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("RECIBO GENERADO POR COBRO DEL MINUTO");
		System.out.println("");
		
		System.out.println(" UBICACIÓN ");
		System.out.println();
		System.out.println(" 1. Norte\n 2. Sur \n 3. oriente \n 4. Occidente");
		System.out.println();
		System.out.println("ELIJA  SU  UBICACIÓN");
		System.out.print(" --->>"); ubicacion= in.nextInt();
		System.out.println("------------------------------------------------");
		
		switch (ubicacion) {
		case 1:
			
			System.out.println(" 1. Pequeño\n 2. Mediano \n 3. Grande");
			System.out.println("SELECCIONE EL TAMAÑO DEL TELEFONO ");
			System.out.print(" --->>"); red= in.nextInt();
			System.out.println("+----------------------------------------------+");
			System.out.println("");
			System.out.println(" DIGITE LOS MINUTOS UTILIZADOS");
			System.out.println("");
			System.out.print(" --->>"); time= in.nextInt();
			
			
			if (red==1) {
				pre= 500*time;
				System.out.println();
				System.out.println("El valor a pagar por minuto consumido es: "+pre);
			} else if (red==2) {
				pre= 250*time;
				System.out.println();
				System.out.println("El valor a pagar por minuto consumido es: "+pre);
				
			}else if (red==3) {
				pre= 100*time;
				System.out.println();
				System.out.println("El valor a pagar por minuto consumido es: "+pre);		
			} else  {
				
				System.out.println("Error, debes digitar numeros enteros ");
			}
			
				break;
			case 2:
		
				System.out.println(" 1. Pequeño\n 2. Mediano");
				System.out.println("SELECCIONE EL TAMAÑO DEL TELEFONO ");
				System.out.print(" --->>"); red= in.nextInt();
				System.out.println("+----------------------------------------------+");
				System.out.println("");
				System.out.println(" DIGITE LOS MINUTOS UTILIZADOS");
				System.out.println("");
				System.out.print(" --->>"); time= in.nextInt();
				
				
				if (red==2) {
					pre= 400*time;
					System.out.println();
					System.out.println("El valor a pagar por minuto consumido es: "+pre);
				} else if (red==2) {
					pre= 200*time;
					System.out.println();
					System.out.println("El valor a pagar por minuto consumido es: "+pre);
					
				}else  {
				
					System.out.println("Error, debes digitar numeros enteros ");
				}
				
				break;
			case 3:
				
				System.out.println(" 1. Pequeño");
				System.out.println("SELECCIONE EL TAMAÑO DEL TELEFONO ");
				System.out.print(" --->>"); red= in.nextInt();
				System.out.println("+----------------------------------------------+");
				System.out.println("");
				System.out.println(" DIGITE LOS MINUTOS UTILIZADOS");
				System.out.println("");
				System.out.print(" --->>"); time= in.nextInt();
				
				
				if (red==1) {
					pre= 100*time;
					System.out.println();
					
				}else  {
				
					System.out.println("Error, debes digitar numeros enteros ");
				}
				
				break;
			case 4:
				
				System.out.println(" 1. Pequeño\n 2. Grande");
				System.out.println("SELECCIONE EL TAMAÑO DEL TELEFONO");
				System.out.print(" --->>"); red= in.nextInt();
				System.out.println("");
				System.out.println("+----------------------------------------------+");
				System.out.println(" DIGITE LOS MINUTOS UTILIZADOS");
				System.out.println("");
				System.out.print(" --->>"); time= in.nextInt();
				
				
				if (red==1) {
					pre= 300*time;
					System.out.println();
					System.out.println("El valor a pagar por minuto consumido es: "+pre);
				} else if (red==2) {
					pre= 200*time;
					System.out.println();
					System.out.println("El valor a pagar por minuto consumido es: "+pre);
					
				}else  {
				
					System.out.println("Error, debes digitar numeros enteros ");
				}
				
				
				
				
				break;
	
			default:
				System.out.println("LA UBICACIÓN DIGITADA ES INEXISTENTE ");
				break;
		}
		
	
		
		}

	}
