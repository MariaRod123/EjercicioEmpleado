public class PruebaClaseAbstracta {

    public static void main(String[] args) {

        /*se crean dos objetos empleados uno con referencia a la clase Empleado y otro con la clase Salario teniendo como base
        la clase heredera Salario y no la clase abstracta*/

        Empleado empleado = new Salario("PABLO PEREZ"," CALLE 123",693,20500.0);
        System.out.println("LLamada a chequeCorreo usando la referencia de la clase Empleado --");
        empleado.chequeCorreo();
        Salario salario = new Salario("LAURA FERRER", "CALLE 874", 895, 32750.0);
        System.out.println("Llamada a chequeCorreo usando la referencia de la clase Salario --");
        salario.chequeCorreo();
    }


    }



