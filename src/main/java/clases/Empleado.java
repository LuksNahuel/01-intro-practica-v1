package clases;

abstract class Empleado {
    protected Integer dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected Double sueldoBase;

    public Empleado(Integer dni, String nombre, String apellido, String email, Double sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }

    public abstract Double getSueldo();
}
