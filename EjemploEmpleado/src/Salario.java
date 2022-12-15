public class Salario extends Empleado{  // clase que hereda metodos abstractos de la clase abstracta va con la palabra extends
    private double salario;  //sueldo del empleado

    //constructor
    public Salario(String nombre, String direccion, int numero,
                   double salario)
    {
        super(nombre, direccion, numero);    //super: palabra reservada para acceder a los atributos y métodos de la clase padre
        setSalario(salario);  //establece el nuevo valor al salario
    }

    /*sobreescribiendo metodo chequeCorreo de la clase abstracta Empleado
    getNombre() es un método heredado de la clase Empleado
     */
    public void chequeCorreo()
    {
        System.out.println("Dentro de chequeCorreo de la clase Salario");
        System.out.println("Enviando cheque a " + getNombre()
                + " con salario " + getSalario());
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double nuevo)
    {
        if (nuevo >= 0.0)
            salario = nuevo;
    }

    //implementación del método abstracto pagoComputado
    public double pagoComputado()
    {
        System.out.println("Computando el pago del salario a "  + getNombre());
        return salario/52;
    }
}
