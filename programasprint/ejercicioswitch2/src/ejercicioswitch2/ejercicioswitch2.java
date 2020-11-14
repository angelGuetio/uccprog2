package ejercicioswitch2;

import java.util.Scanner;

public class ejercicioswitch2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Scanner teclado=new Scanner(System.in);
		Scanner scan =new Scanner(System.in);
		
		
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando el switch en java: Ejemplo # 2     |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("COBRO DE TARIFA POR CONCEPTO DE CARNET UNIVERSIDAD DE VIDA");
		
		
		String nombre,economia,administracion, ciencias;
		int carrera=0;
		int semestre;
		int diner, diner1, diner2;
		
		System.out.println();
		System.out.println("DIGITE SU NOMBRE");
		System.out.print(" --->>"); nombre= teclado.nextLine();
		System.out.println();
		System.out.println(" CARRERAS ");
		System.out.println();
		System.out.println("  1. Economia\n 2. Administracion\n 3. Ciencias");
		System.out.println();
		System.out.println("SELECCIONE SU CARRERA ");
		System.out.print(" --->>"); carrera= in.nextInt();
		
		switch (carrera) {
		case 1: 
			System.out.println("DIGITE EL  SEMESTRE ");
			System.out.print(" --->>"); semestre= in.nextInt();
			
			if (semestre>=1 & semestre<=3) {
				diner=1500;
				
				System.out.println("Pago efectuado ");
				System.out.println();
				System.out.println("Nombre:"+nombre);
				System.out.println("Carrera: "+ "economia" );
				System.out.println("Semestre :"+semestre);
				System.out.println("El valor pagado fue :"+diner );
				
			}else if(semestre>=4 & semestre<=7){
				diner1=2220;
				System.out.println();
				System.out.println("Pago efectuado ");
				System.out.println();
				System.out.println("Nombre:"+nombre);
				System.out.println("Carrera: "+ "economia" );
				System.out.println("Semestre :"+semestre);
				System.out.println("El valor pagado fue :"+diner1 );
				
			}else if(semestre>=8 & semestre<=10){
				diner2=3000;
				System.out.println("Pago efectuado ");
				System.out.println();
				System.out.println("Nombre:"+nombre);
				System.out.println("Carrera: "+ "economia" );
				System.out.println("Semestre :"+semestre);
				System.out.println("El valor pagado fue :"+diner2 );
			}
			
			
			break;
		case 2:
			
			System.out.println("Digite el semestre al que pertenece: ");
			System.out.print(" --->>"); semestre= in.nextInt();
			
			if (semestre>=1 & semestre<=3) {
				diner=2000;
				
				System.out.println("Pago efectuado ");
				System.out.println();
				System.out.println("Nombre:"+nombre);
				System.out.println("Carrera: "+ "Administracion" );
				System.out.println("Semestre :"+semestre);
				System.out.println("El valor pagado fue :"+diner );
				
			}else if(semestre>=4 & semestre<=7){
				diner1=4000;
				System.out.println("Pago efectuado ");
				System.out.println();
				System.out.println("Nombre:"+nombre);
				System.out.println("Carrera: "+ "Administración");
				System.out.println("Semestre :"+semestre);
				System.out.println("El valor pagado fue :"+diner1 );
				
			}else if(semestre>=8 & semestre<=10){
				diner2=6000;
				System.out.println("Pago efectuado ");
				System.out.println();
				System.out.println("Nombre:"+nombre);
				System.out.println("Carrera: "+ "Administración" );
				System.out.println("Semestre :"+semestre);
				System.out.println("El valor pagado fue :"+diner2 );
			}
			
			
			break;
		case 3:
			System.out.println("Digite el semestre al que pertenece: ");
			System.out.print(" --->>"); semestre= in.nextInt();
			
			if (semestre>=1 & semestre<=3) {
				diner=1800;
				
				System.out.println("Pago efectuado ");
				System.out.println();
				System.out.println("Nombre:"+nombre);
				System.out.println("Carrera: "+ "Ciencias" );
				System.out.println("Semestre :"+semestre);
				System.out.println("El valor pagado fue :"+diner );
				
			}else if(semestre>=4 & semestre<=7){
				diner1=5000;
				System.out.println("Pago efectuado ");
				System.out.println();
				System.out.println("Nombre:"+nombre);
				System.out.println("Carrera: "+ "Administracion");
				System.out.println("Semestre :"+semestre);
				System.out.println("El valor pagado fue :"+diner1 );
				
			}else if(semestre>=8 & semestre<=10){
				diner2=7000;
				System.out.println("Pago efectuado ");
				System.out.println();
				System.out.println("Nombre:"+nombre);
				System.out.println("Carrera: "+ "Administracion" );
				System.out.println("Semestre :"+semestre);
				System.out.println("El valor pagado fue :"+diner2 );
			}
			
			
			break;

		default:
			System.out.println("La acción que estas ejecutando no es valida.");
			break;
		}

		

	
	
	}
}
	