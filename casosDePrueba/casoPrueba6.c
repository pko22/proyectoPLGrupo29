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
	var_in = 10;
	var_inout = 5;
	test_proc(&var_out, var_in, &var_inout);
	var_in = test_fun(var_in, var_inout);
}
