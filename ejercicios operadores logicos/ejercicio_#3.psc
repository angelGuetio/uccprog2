Proceso ejercicio
	definir a,b,c,d como entero;
	definir s,t Como Logico;
	
	c <- 1;
	b <- 0;
	
	Escribir "Napoleon nacio en Francia? [0] falso, [1] verdadero";
	leer a;
	
	si a=c entonces;
		s= a > b;
	SiNo
		s= b > a;
	FinSi
	
	
	
	Escribir "La Torre Eiffel esta en Australia? [0] falso, [1] verdadero";
	leer b;
	
	si a=c entonces;
		t= b > a;
	SiNo
		t= b > a;
	FinSi
	Escribir "";
	Escribir "La respuesta de a la pregunta 1 es:",s;
	Escribir "La respuesta de a la pregunta 2 es:",t;
	
FinProceso
