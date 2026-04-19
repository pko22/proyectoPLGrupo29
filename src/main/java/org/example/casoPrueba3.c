#define MIN 0
#define MAX 100
#define PI 3.141592
#define NO "NO"
#define SI "SI"
#define MSJ "Hola \"Mundo\""
float calcularArea(float radio);
void imprimir(int val, char mensaje[]);
float calcularArea(float radio) {
	float area;
	area = PI * radio * radio;
	return area;
}

void imprimir(int val, char mensaje[]) {
	val = val + 1;
}


void main (void) {
	int i = 0, j;
	float calc = 0.0;
	char texto[20];
	j = MAX - MIN;
	calc = calcularArea(5.5);
	imprimir(j, MSJ);
}
