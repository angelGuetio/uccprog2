import java.util.Random;

public class explicacion_cicloFor {
	public static void main(String[] args) {
		
	
	System.out.println("+----------------------------------------------------+");
	System.out.println("|  AUTOR: Angel Yesid Guetio                         |");
	System.out.println("|  FECHA: Noviembre 14 del 2020                      |");
	System.out.println("+----------------------------------------------------+");
	System.out.println("|  Etrucruras de repetición en java: Ejemplo # 2     |");
	System.out.println("+----------------------------------------------------+");
	System.out.println("");
	System.out.println("condicionales ");
	
	boolean condicion= false;
	
	do {
		Random  random= new Random();
		int intRandom = random.nextInt(10);
		condicion=true;
		
		if (intRandom < 5) condicion = false;
		
		
		System.out.println("Estoy dentro del ciclo haga mientras"+intRandom+"condicion de salida ciclo"+condicion);
		
	}while(condicion);
		
	
	
	
	
	
	
	
	
	
	}

}
