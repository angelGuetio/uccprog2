import java.util.Scanner;

public class EjercicioEnClase06 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                                             |");
		System.out.println("|  FECHA: Octubre 31 del 2020                                            |");
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("|  CONDICIONALES: Ejemplo # 5                                            |");
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("");
	
		
		String nombre;
		
		int pagina1=15;
		int pagina2=75;
		
		int minutos=30;
		int horas=120;
		
		int c=0;
		int d=0;
		int e=0;
		int f=0;

		c= (15*120)/30;
		d= (75*30)/15;
		
		System.out.println("    CALCULANDO EL NUMERO DE PAGINAS QUE PUEDE ESCRIBIR UNA SECRETARIA    ");
		System.out.println("");
		System.out.println("    NUMERO DE GAGINAS       HORAS         MINUTOS    ");
		System.out.println("");
		System.out.println("         15                                  30      ");
		System.out.println("");
		System.out.println("         X                   2       =       120     ");
		System.out.println("");
		System.out.println("         75                                   X      ");
		System.out.println("");

		
		System.out.println("");
		System.out.println("  APLICANDO LA REGLA DE TRES  ");
		System.out.println("");
		System.out.println("Operación para obtener el numero de paginas =  (15*120)/30 ");
		System.out.println("");
		System.out.println("Operación para obtener los minutos tardados = (75*30)/15   ");
		System.out.println("");
		System.out.println("La secretaria escribe  "+ c + "  paginas en dos horas "+ "  y  75 paginas en "+d +"  minutos.");
		System.out.println("");
	
	}
}
