Proceso sin_titulo
	definir a,b,d,e,f como entero;
	definir x, c,r Como Caracter;
	
	f <- 18;
	
	escribir " Escriba su nombre:";
	leer c;
	escribir "Escriba su edad:";
	leer a;
	si a >= f Entonces
		X <- "usted es mayor de edad";
	SiNo
		X <- "usted es menor de edad";
	FinSi
	
	escribir "Digite su numero de documento:";
	leer b;
	si b =10 entonces 
		r <- "documento valido";
	SiNo
		r <- "documento invalido";
		
	FinSi
	
	escribir"";
	escribir "Su nombre es:",c;
	escribir "Usted es:",x;
	escribir "Su número de documento es:",b,r;
	
	
	
	// escribir la edad de una persona y decir si es mayor o menor de edad
FinProceso
