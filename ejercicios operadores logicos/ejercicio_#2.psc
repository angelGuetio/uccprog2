Proceso ejercicio
	definir a,b,c,d como entero;
	definir s,t como logico;
	
	c <- 1;
	d <- 0;
	
	Escribir "¿El sol es una estrella? [0] falso, [1] verdad";
	leer a;
	
	si a = c entonces 
		s = c > d ;
	SiNo
		s = d > c;
	FinSi
	
	Escribir "¿La luna es un satelite de la tierra? [0] falso, [1] verdad";
	leer b;
	
	si b = c entonces 
		t = c > d ;
	SiNo
		t = d > c;
	FinSi
	
	
	Escribir "";
	Escribir "El valor final de s es:",s;
	Escribir "El valor final de s es:",t;
FinProceso
