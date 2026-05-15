PROGRAM prueba_parametros ;

! --- 1. Declaraciones del programa principal ---
REAL :: var_out ;
INTEGER :: var_in, var_inout ;

! --- 2. Cabeceras (INTERFACE) ---
INTERFACE
    ! Subrutina con los 3 tipos de parametros
    SUBROUTINE test_proc ( p_out, p_in, p_inout )
        REAL, INTENT(OUT) p_out ;
        INTEGER, INTENT(IN) p_in ;
        INTEGER, INTENT(INOUT) p_inout ;
    END SUBROUTINE test_proc

    ! Funcion normal para asegurar que IN funciona bien
    FUNCTION test_fun ( p_in1, p_in2 )
        INTEGER :: test_fun ;
        INTEGER, INTENT(IN) p_in1 ;
        INTEGER, INTENT(IN) p_in2 ;
    END FUNCTION test_fun
END INTERFACE

! --- 3. Sentencias del main ---
var_in = 10 ;
var_inout = 5 ;

! Llamada a procedimiento: Debera poner '&' a var_out y var_inout
CALL test_proc ( var_out, var_in, var_inout ) ;

! Llamada a funcion: No debe llevar '&' porque son IN
var_in = test_fun ( var_in, var_inout ) ;

END PROGRAM prueba_parametros

! --- 4. Implementacion de Subprogramas ---
SUBROUTINE test_proc ( p_out, p_in, p_inout )
    REAL, INTENT(OUT) p_out ;
    INTEGER, INTENT(IN) p_in ;
    INTEGER, INTENT(INOUT) p_inout ;

    ! En C, esto deberia traducirse con asteriscos: *p_out = 3.14;
    p_out = 3.14 ;
    ! Y esto: *p_inout = *p_inout + p_in;
    p_inout = p_inout + p_in ;
END SUBROUTINE test_proc

FUNCTION test_fun ( p_in1, p_in2 )
    INTEGER :: test_fun ;
    INTEGER, INTENT(IN) p_in1 ;
    INTEGER, INTENT(IN) p_in2 ;

    ! Esto es el return de la funcion
    test_fun = p_in1 * p_in2 ;
END FUNCTION test_fun