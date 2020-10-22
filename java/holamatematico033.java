public class holamatematico03 {
	public static void main(String [] args) {
		
		System.out.println("+-------------------------------------------------+");
		System.out.println("| AUTOR:Angel Yesid Guetio                        |");
		System.out.println("| FECHA: 17-10-2020                               |");
		System.out.println("|-------------------------------------------------+");
		System.out.println("|   PROGRAMA MATEMATICO 03: DIVISION DE ENTEROS   |");
		System.out.println("+-------------------------------------------------+");
		System.out.println();
		
		System.out.println("argumento 1 ="+args[0]);
		System.out.println("argumento 2 ="+args[1]);
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int resultadosuma = num1 / num2;
		System.out.println ("Operacion matematica: num1 = "+num1+", num2 = "+num2);
		System.out.println ("Division num1 / num2 ="+resultadosuma);
	}
}