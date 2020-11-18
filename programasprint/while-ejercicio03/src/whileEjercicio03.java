import java.util.Scanner;

public class whileEjercicio03 {
	public static void main(String[] args) {
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Noviembre 07 del 2020                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  Operando Bucles: Ejemplo # 2                |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		System.out.println("NUMERO CAPICUA");
		System.out.println("");
		
		Scanner f =new Scanner(System.in);
		
		int N, aux, inverso = 0, cifra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un número mayor a dos cifras: ");                                                 
            N = sc.nextInt();
            System.out.println("");
        } while (N < 10);
       
      
        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(N == inverso){
            System.out.println("El numero es capicua");
        }else{
            System.out.println("El numero no es capicua");
        }

	}


}
