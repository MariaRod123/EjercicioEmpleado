public abstract class Empleado {       //la clase abstracta siempre se declara con la palabra abstract

    private String nombre;  //nombre empleado
    private String direccion; //direccion del empleado
    private int numero;  //numero de empleado

    public Empleado(String nombre, String direccion, int numero)
    {
        System.out.println("Construyendo un empleado");
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
    }

    public abstract double pagoComputado();  //metodo abstracto: se implementará en clase heredera Salario

    public void chequeCorreo()
    {
        System.out.println("Enviando el cheque por correo a "
                + this.nombre + " " + this.direccion);
    }

    public String toString()
    {
        return nombre + " " + direccion + " " + numero;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String nueva)
    {
        direccion = nueva;
    }

    public int getNumero()
    {
        return numero;
    }

}
