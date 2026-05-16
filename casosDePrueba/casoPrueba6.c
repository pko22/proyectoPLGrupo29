#define c_hex 0xA34
#define c_oct 0o740
#define c_bin 0b101
#define co2 0o101
#define cb1 0b011
#define ch4 0x010
#define ch3 0x106
#define ch2 0x890
void test_proc(float *p_out, int p_in, int *p_inout);
int test_fun(int p_in1, int p_in2);
void test_proc(float *p_out, int p_in, int *p_inout) {
	*p_out = 3.14;
	*p_inout = *p_inout + p_in;
}

int test_fun(int p_in1, int p_in2) {
	return p_in1 * p_in2;
}


void main (void) {
	float var_out;
	int var_in, var_inout;
	int v_bin = 0b011;
	int v_oct = 0o101;
	int v_hex = 0x010;
	int a = 5;
	int b = 10;
	int i;
	v_bin = 0b1100;
	v_oct = 0o777;
	v_hex = 0x1F;
	if (a < b && 1) 
		a = 0;
	if (v_bin == 0b1100 || 0) {
		a = 1;
	}
	if (!(v_oct >= 0o1000) == 1) {
		b = a;
	} else {
		a = b;
	}
	while (a < 10 != 0) {
		a = a + 1;
	}
	for(i = 0; i != 10; i = i + 1) {
		v_hex = v_hex + i;
	}
	switch (a) {
		case 1:
			b = 10;
			break;
		case 2:
		case 3:
		case 4:
			b = 20;
			break;
		case 5 to 8:
			b = 30;
			break;
		case < 0:
			b = -1;
			break;
		case > 9:
			b = 100;
			break;
		default:
			b = 0;
	}
	switch (v_bin) {
		case 0b000:
			i = 0;
			break;
		case 0b001 to 0b111:
			i = 1;
			break;
		default:
			i = -1;
	}
	var_in = 10;
	var_inout = 5;
	test_proc(&var_out, var_in, &var_inout);
	var_in = test_fun(var_in, var_inout);
}
