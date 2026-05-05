void mostrar(int a);
int calcular(int x);
int fun1(int a, char b[]);
void proc1(float c, int d, int e);
void proc2(void);
void mostrar(int a) {
	int b = 0;
}

int calcular(int x) {
	return x + 2;
}

void proc2(void) {
	proc1(c, d, e);
}

void proc1(float c, int d, int e) {
	c = fun1(d, 1.0);
}

int fun1(int a, float b) {
	proc2();
	return a * 2;
}


void main (void) {
	int resultado;
	mostrar(10);
	resultado = calcular(5);
}
