import java.util.Scanner;

public class EjercicioEnClase05 {
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
	System.out.println();
	
	String producto;
	
	int a=0;
	int b=0;
	int c=0;
	int d=0; 
	

	
	System.out.println("Ingrese el nombre del producto ");
	System.out.print(" --->>"); producto = teclado.nextLine();
	System.out.println("Ingrese el costo del producto: ");
	System.out.print(" --->>"); a= in.nextInt();
	System.out.println("Ingrese el valor con el cual concelo: ");
	System.out.print(" --->>"); b= in.nextInt();

	
	if(a==b) {
		System.out.println("Nombre del producto: "+producto);
		System.out.println("Valor del producto: "+a);
		System.out.println("Valor con el cual cancelo :"+b +  "$");
		System.out.println();
		System.out.println("Usted realizo el pago completo, muchas gracias por su compra");	
	}
	else if(b>a) {
		c=b-a;
		System.out.println("Nombre del producto: "+producto);
		System.out.println("Valor del producto: "+a +   "$");
		System.out.println("Valor con el cual cancelo :"+b +  "$");
		System.out.println();
		System.out.println("La devuelta de su compra es: "+c +  "$");
		}
	else if(b<a) {
		d= (a-b);
		System.out.println("Nombre del producto: "+producto);
		System.out.println("Valor del producto: "+a +   "$");
		System.out.println("Valor con el cual cancelo :"+b +  "$");
		System.out.println();
		System.out.println("El prdoducto no puede ser entregado debes cancelar los  "+d +" $ " +"  restantes.  ");
		
		
	}
	
	
	}
}
