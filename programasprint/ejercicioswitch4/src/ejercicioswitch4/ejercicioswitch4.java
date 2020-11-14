package ejercicioswitch4;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ejercicioswitch4 {
	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		Scanner teclado=new Scanner(System.in);
		Scanner scan =new Scanner(System.in);
		
		
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando el switch en java: Ejemplo # 4     |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("LOS  PILITOS S.A.S");
		
		
		String Zapatos,Camisas, pantalones,Guantes;
		int producto=0;
		int cantidad;
		double daner,daner1,daner2,daner3;
	
		System.out.println();
		System.out.println(" ¿ QUE PRODUCTOS DESEAS COMPRAR ? ");
		System.out.println();
		System.out.println(" 1. Zapatos\n 2. Camisas\n 3. pantalones");
		System.out.println();
		System.out.println("SELECCIONE EL PRODUCTO ");
		System.out.print(" --->>"); producto= in.nextInt();
		
		switch (producto) {
		case 1: 
			System.out.println("DIGITE  LA CANTIDAD REQUERIDA");
			System.out.print(" --->>"); cantidad= in.nextInt();
			
			if (cantidad>500) {
				daner2= 1000*cantidad;
				daner =(1000*0.09);
				daner1=daner+1000;
				
				System.out.println();
				System.out.println("                         Pago efectuado ");
				System.out.println();
				System.out.println("Nombre del producto      :"+"Zapatos");
				System.out.println("unidades compradas       : "+cantidad );
				System.out.println("Valor a pagar sin IVA    :"+daner2 );
				System.out.println("Valor a pagar con IVA 9% :"+daner1*cantidad );
				
				
				}else if(cantidad<501) {
					daner2= 500*cantidad;
					daner =(500*0.07);
					daner1=daner+500;
					
					System.out.println();
					System.out.println("                         Pago efectuado ");
					System.out.println();
					System.out.println("Nombre del producto      :"+"Zapatos");
					System.out.println("unidades compradas       : "+cantidad );
					System.out.println("Valor a pagar sin IVA    :"+daner2 );
					System.out.println("Valor a pagar con IVA 7% :"+daner1*cantidad );
					
				}
				
			break;
			
		case 2:
			System.out.println("DIGITE  LA CANTIDAD REQUERIDA");
			System.out.print(" --->>"); cantidad= in.nextInt();
			
			if (cantidad>500) {
				daner2=1400*cantidad;
				daner =(1400*0.09);
				daner1=daner+1000;
				
				System.out.println();
				System.out.println("                         Pago efectuado ");
				System.out.println();
				System.out.println("Nombre del producto      :"+"Camisas");
				System.out.println("unidades compradas       : "+cantidad );
				System.out.println("Valor a pagar sin IVA    :"+daner2);
				System.out.println("Valor a pagar con IVA 11% :"+daner1*cantidad );
				
				
				}else if(cantidad<501) {
					daner2=500*cantidad;
					daner =(500*0.08);
					daner1=daner+800;
					
					System.out.println();
					System.out.println("                         Pago efectuado ");
					System.out.println();
					System.out.println("Nombre del producto      :"+"Camisas");
					System.out.println("unidades compradas       : "+cantidad );
					System.out.println("Valor a pagar sin IVA    :"+daner2);
					System.out.println("Valor a pagar con IVA 8% :"+daner1*cantidad );
					
				}
		
			break;
		case 3:
			System.out.println("DIGITE  LA CANTIDAD REQUERIDA");
			System.out.print(" --->>"); cantidad= in.nextInt();
			
			if (cantidad>500) {
				daner2=1600*cantidad;
				daner =(1600*0.1);
				daner1=daner+1600;
				
				System.out.println();
				System.out.println("                         Pago efectuado ");
				System.out.println();
				System.out.println("Nombre del producto      :"+"Pantalones");
				System.out.println("unidades compradas       : "+cantidad );
				System.out.println("Valor a pagar sin IVA    :"+daner2 );
				System.out.println("Valor a pagar con IVA 10% :"+daner1*cantidad );
				
				
				}else if(cantidad<501) {
					daner2=1000*cantidad;
					daner =(1000*0.08);
					daner1=daner+1000;
					
					System.out.println();
					System.out.println("                         Pago efectuado ");
					System.out.println();
					System.out.println("Nombre del producto      :"+"Pantalones");
					System.out.println("unidades compradas       : "+cantidad );
					System.out.println("Valor a pagar sin IVA    :"+daner2);
					System.out.println("Valor a pagar con IVA 5% :"+daner1*cantidad );
				
				}
			
			break;
		default:
			System.out.println("La opción seleccionada no es valida.");
			break;
		}

		
	}
}
