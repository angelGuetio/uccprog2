import java.util.Random;

public class explicacion_do__while {
	public static void main(String[] args) {
		
	
	System.out.println("+----------------------------------------------------+");
	System.out.println("|  AUTOR: Angel Yesid Guetio                         |");
	System.out.println("|  FECHA: Noviembre 14 del 2020                      |");
	System.out.println("+----------------------------------------------------+");
	System.out.println("|  Etrucruras de repetición en java: Ejemplo # 2     |");
	System.out.println("+----------------------------------------------------+");
	System.out.println("");
	System.out.println("condicionales ");
	System.out.println("");
	
	
	int contador=0;
	int acumulador=0;
	
	
	Random  aleatorio= new Random();
	int intCantidadCiclos = aleatorio.nextInt(50);
	int intRandom= 0;
	
	System.out.println("candidad de ciclos: "+intCantidadCiclos);
	
	for (int i = 1; i <= intCantidadCiclos;i++) {
		intRandom= aleatorio.nextInt(50);
		acumulador=acumulador+intRandom;
		contador= i;
		
		System.out.println("Estoy dentro dentro del ciclo FOR contador "+contador+" condicion de salida ciclo >>>"+(i<= intRandom));
		
		
		
	}
	System.out.println("+----------------------------------------------------+");
	System.out.println(" Ciclo realizados:"+ contador                          );
	System.out.println(" Valor acomulado :"+ acumulador                         );
	System.out.println("+----------------------------------------------------+");
		
	
	}

}
