public class programaargumentos01 {
	public static void main(String[]args){
		System.out.println("+----------------------------------------+");
		System.out.println("| Autor: Angel Yesid Guetio              |");
		System.out.println("| Fecha: 24/Octubre /2020                |");
		System.out.println("+----------------------------------------+");
		System.out.println("| Programa Argumento 01:               |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		
		String binario="100111";
		
		int[]bases = { 2, 8, 10, 16, 36};
		
		System.out.println("conversion binario a diferentes bases:");
		
		for (int base:bases){
			System.out.printf("%s =>%d\n", binario,Integer.valueOf(binario,base));
		}
		
		
		System.out.println("\nDecimal a binario:");
		int numero=42;
		
		for (int base : bases){
			System.out.printf("%d=>%s\n", numero, Integer.toString(numero,base));
		}
	}
}