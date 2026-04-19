#define min_val -50
#define max_val 100
#define c 2e-6
#define e 2.71828
#define pi 3.1415
void ImprimirMensaje(texto);
int Sumar(a, b);
void ImprimirMensaje(texto) {
	MostrarEnPantalla(texto);
}

int Sumar(a, b) {
	suma = a + b;
	Sumar = suma;
}


void main (void) {
	int contador = 0, acumulador;
	float promedio, total = 0.0;
	char mensaje1[10] = "Hola", mensaje2[10] = "Mundo";
	contador = contador + 1;
	total = total + 45.6;
	ImprimirMensaje("Bienvenido");
	promedio = total / 2.0;
}
