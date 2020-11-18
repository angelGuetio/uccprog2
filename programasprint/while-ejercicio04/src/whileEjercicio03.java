
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
		
		
		int iNumero = 22;
		int digito=0;
		
		
		
		
		int iCantidad = 0;
		int iTemp = iNumero;
				
		while (iTemp>0){
		  iTemp = iTemp/10;
		  if(iTemp>0) {
			  iTemp=digito;
			  }
		  iCantidad++;
		}
				
		
		System.out.println(+ iTemp);
	}

}
