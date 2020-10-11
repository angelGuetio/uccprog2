Proceso sin_titulo
	definir pesp1, pesp2,pesp3,pesp4 Como Entero;
	definir k Como Logico;
	
	escribir "¿Benjamin Franklin invento el pararrayos? [0] falso, verdadero [1]";
	leer pesp1;
	escribir "¿Samuel morse invento el telegrafo? [0] falso, verdadero [1]";
	leer pesp2;
	escribir "¿Perú es un pais sur americano? [0] falso, verdadero [1]";
	leer pesp3;
	escribir "¿ 5 es un número primo ? [0] falso, verdadero [1]";
	leer pesp4;
	
	escribir "";
	
	k <- (pesp1 >= pesp2) y (pesp3 = pesp4);
	
	escribir "el valor final vale:",k;
FinProceso
