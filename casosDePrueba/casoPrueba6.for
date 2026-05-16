PROGRAM prueba_parametros ;

! --- 1. Declaraciones del programa principal ---
REAL :: var_out ;
INTEGER :: var_in, var_inout ;

! --- CASOS CORRECTOS BASES ---
INTEGER, PARAMETER :: c_bin = b'101', c_oct = o'740', c_hex = z'A34';
INTEGER, PARAMETER :: cb1 = b'011', co2 = o'101';
INTEGER, PARAMETER :: ch2 = z'890', ch3 = z'106', ch4 = z'010';

INTEGER :: v_bin = b'011';
INTEGER :: v_oct = o'101';
INTEGER :: v_hex = z'010';

! --- VARIABLES PARA CONTROL DE FLUJO ---
INTEGER :: a = 5;
INTEGER :: b = 10;
INTEGER :: i;

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
! --- ASIGNACIONES BASICAS ---
v_bin = b'1100';
v_oct = o'777';
v_hex = z'1F';

! --- SENTENCIAS DE CONTROL DE FLUJO ---
! IF de una linea con logica y relacionales
IF (a < b .AND. .TRUE.) a = 0;

! IF - THEN interactuando con bases
IF (v_bin == b'1100' .OR. .FALSE.) THEN
    a = 1;
ENDIF

! IF - THEN - ELSE con condicion compleja (.NOT. y .EQV.)
IF (.NOT. (v_oct >= o'1000') .EQV. .TRUE.) THEN
    b = a;
ELSE
    a = b;
ENDIF

! Bucle DO WHILE con .NEQV.
DO WHILE (a < 10 .NEQV. .FALSE.)
    a = a + 1;
ENDDO

! Bucle DO (For)
DO i = 0, 10, 1
    v_hex = v_hex + i;
ENDDO

! --- SELECT CASE MULTIPLE ---
SELECT CASE (a)
CASE (1)
    b = 10;
CASE (2, 3, 4)
    b = 20;
CASE (5:8)
    b = 30;
CASE (:0)
    b = -1;
CASE (9:)
    b = 100;
CASE DEFAULT
    b = 0;
END SELECT

! --- SELECT CASE CON BASES ---
SELECT CASE (v_bin)
CASE (b'000')
    i = 0;
CASE (b'001':b'111')
    i = 1;
CASE DEFAULT
    i = -1;
END SELECT


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