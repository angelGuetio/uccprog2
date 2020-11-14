package ejercicioswitch5;

import java.util.Scanner;

public class ejercicioswitch5 {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		Scanner teclado=new Scanner(System.in);
		Scanner scan =new Scanner(System.in);
		
		
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando el switch en java: Ejemplo # 5     |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("FLOTA LAS PANTERAS S.A.S");
		
		
		String Corrienete,Ejecutivo;
		int servicio=0;
		int ruta;
		double daner,daner1,daner2,daner3;
	
		System.out.println();
		System.out.println(" TIPO DE SERVICIO ");
		System.out.println();
		System.out.println(" 1. Corriente\n 2. Ejecutivo");
		System.out.println();
		System.out.println("SELECCIONE EL PRODUCTO ");
		System.out.print(" --->>"); servicio= in.nextInt();
		
		switch (servicio) {
		case 1: 
			System.out.println("RUTA");
			System.out.print(" --->>"); ruta= in.nextInt();
			
			if (ruta==1) {
				daner =(200*0.3);
				daner1=(200*0.1);
				daner2=daner+daner1;
				daner3=200-daner2;
				
				System.out.println();
				System.out.println("                                RESULTADOS DE ANALISIS ");
				System.out.println();
				
				System.out.println(" tipo de servicio                   :"+"Corriente");
				System.out.println(" Valor del pasaje                   :"+200);
				System.out.println("% asignado a salario conductor 30%  :"+daner );
				System.out.println("% salario mantenimiento        10%  :"+daner1);
				System.out.println("Utilida para la empresa        60%  :"+ (200-daner3));
				
				}else if(ruta==2) {
					daner =(200*0.25);
					daner1=(200*0.15);
					daner2=daner+daner1;
					daner3=200-daner2;
					
					System.out.println();
					System.out.println("                         RESULTADOS DE ANALISIS ");
					System.out.println();
					
					System.out.println(" tipo de servicio                  :"+"Corriente");
					System.out.println(" Valor del pasaje                  :"+200);
					System.out.println("% asignado a salario conductor 25% :"+daner );
					System.out.println("% salario mantenimiento        15% :"+daner1);
					System.out.println("Utilida para la empresa        60% :"+ (200-daner3));
					
				}else if(ruta==3) {
					daner =(200*0.2);
					daner1=(200*0.2);
					daner2=daner+daner1;
					daner3=200-daner2;
					
					System.out.println();
					System.out.println("                         RESULTADOS DE ANALISIS ");
					System.out.println();
					
					System.out.println(" tipo de servicio                   :"+"Corriente");
					System.out.println(" Valor del pasaje                   :"+200);
					System.out.println("% asignado a salario conductor  20% :"+daner );
					System.out.println("% salario mantenimiento         20% :"+daner1);
					System.out.println("Utilida para la empresa             :"+ (200-daner3));
					
				}else if(ruta==4) {
					daner =(200*0.22);
					daner1=(200*0.2);
					daner2=daner+daner1;
					daner3=200-daner2;
					
					System.out.println();
					System.out.println("                         RESULTADOS DE ANALISIS ");
					System.out.println();
					
					System.out.println(" tipo de servicio                  :"+"Corriente");
					System.out.println(" Valor del pasaje                  :"+200);
					System.out.println("% asignado a salario conductor 22% :"+daner );
					System.out.println("% salario mantenimiento        20% :"+daner1);
					System.out.println("Utilida para la empresa        58% :"+ (200-daner3));
					
				}
				
			break;
		case 2:
			System.out.println("RUTA");
			System.out.print(" --->>"); ruta= in.nextInt();
			
			if (ruta==1) {
				daner =(300*0.3);
				daner1=(300*0.1);
				daner2=daner+daner1;
				daner3=300-daner2;
				
				System.out.println();
				System.out.println("                                RESULTADOS DE ANALISIS ");
				System.out.println();
				
				System.out.println(" tipo de servicio                   :"+"Corriente");
				System.out.println(" Valor del pasaje                   :"+300);
				System.out.println("% asignado a salario conductor 30%  :"+daner );
				System.out.println("% salario mantenimiento        10%  :"+daner1);
				System.out.println("Utilida para la empresa        60%  :"+ (300-daner3));
				
				}else if(ruta==2) {
					daner =(300*0.25);
					daner1=(300*0.15);
					daner2=daner+daner1;
					daner3=300-daner2;
					
					System.out.println();
					System.out.println("                         RESULTADOS DE ANALISIS ");
					System.out.println();
					
					System.out.println(" tipo de servicio                  :"+"Corriente");
					System.out.println(" Valor del pasaje                  :"+300);
					System.out.println("% asignado a salario conductor 25% :"+daner );
					System.out.println("% salario mantenimiento        15% :"+daner1);
					System.out.println("Utilida para la empresa        60% :"+ (300-daner3));
					
				}else if(ruta==3) {
					daner =(300*0.2);
					daner1=(300*0.2);
					daner2=daner+daner1;
					daner3=300-daner2;
					
					System.out.println();
					System.out.println("                         RESULTADOS DE ANALISIS ");
					System.out.println();
					
					System.out.println(" tipo de servicio                   :"+"Corriente");
					System.out.println(" Valor del pasaje                   :"+300);
					System.out.println("% asignado a salario conductor  20% :"+daner );
					System.out.println("% salario mantenimiento         20% :"+daner1);
					System.out.println("Utilida para la empresa             :"+ (300-daner3));
					
				}else if(ruta==4) {
					daner =(300*0.22);
					daner1=(300*0.2);
					daner2=daner+daner1;
					daner3=300-daner2;
					
					System.out.println();
					System.out.println("                         RESULTADOS DE ANALISIS ");
					System.out.println();
					
					System.out.println(" tipo de servicio                  :"+"Corriente");
					System.out.println(" Valor del pasaje                  :"+300);
					System.out.println("% asignado a salario conductor 22% :"+daner );
					System.out.println("% salario mantenimiento        20% :"+daner1);
					System.out.println("Utilida para la empresa        58% :"+ (300-daner3));
				
				}
			
			break;
		default:
			System.out.println("El servicio es inexistente");
			break;
		}

				
	}		
}
