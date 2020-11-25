
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

public class menu {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		
		System.out.println("+----------------------------------------------+");
		System.out.println("|  AUTOR: Angel Yesid Guetio                   |");
		System.out.println("|  FECHA: Octubre 24 del 2020                  |");
		System.out.println("+----------------------------------------------+");
		System.out.println("|  ejecución de todos los trabajos              |");
		System.out.println("+----------------------------------------------+");
		System.out.println("");
		
		
		int opcion;
		char otro;
		
		String comando="",ruta="D:\\programas" ;
		
		System.out.println("opcion suma");
		
		opcion=leer.nextInt();
		
		switch (opcion) {
		case 1:
			comando="Ejemplo02";
			break;

		default:
			System.out.println("hay un posible error");
			break;
		}
		
		try {
			var processBuilder= new ProcessBuilder();
			processBuilder.command("java","D:\\programas");
			var process= processBuilder.inheritIO().start();
			var ret =process.waitFor();
		} catch (Exception e) {
			System.out.println(e);
			
		}
		System.out.println("deseas continuar con otro programa S/N");
		otro=leer.next().charAt(0);
		while(otro=='s'||otro=='s');
		
	
		
	}
}
