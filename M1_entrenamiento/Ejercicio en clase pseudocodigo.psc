Proceso Ejercicio_en_clase
	definir m, lo, p Como Entero;
	definir a, b, c como real;
	
	m <-6 ; lo <- 8; p <- 5;
	
	// se debe tener en cuenta  el punto y coma  para cerrar nuestra variable.
	a <- 3.5;
	b <- 4.5;
	c <- 4.2;
	
	m <- lo * p;
	lo <- p + m;
	p <- m + lo;
	
	a <- a / 3;
	b <- b * 2 / a;
	c <- c + a - a * b;
	
	
	// visualización de las operaciones realizadas.
	Escribir "el valor de a es:", a;
	Escribir "el valor de b es:", b;
	Escribir "el valor de c es:", c;
	Escribir "el valor de m es:", m;
	Escribir "el valor de lo es:", lo;
	Escribir "el valor de p es:", p;
	
	
	
FinProceso
