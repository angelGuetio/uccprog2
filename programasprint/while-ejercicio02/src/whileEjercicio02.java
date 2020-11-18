import java.util.Scanner;

public class whileEjercicio02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando Bucles: Ejemplo # 2                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("LA SUMA DE LOS DIGITOS");
		System.out.println("");
		
		int numero;
		int resultado= 0;
		
		System.out.println("Ingrese un numero mayor a dos cifras");
		numero= s.nextInt();
		System.out.println();
		
		System.out.println("El numero es: " +numero);
		
		while(numero>0){
			resultado += numero%10;
			numero = numero / 10;
		}
		System.out.println("La suma de sus digitos es: "+resultado);
		
		
	}

}
