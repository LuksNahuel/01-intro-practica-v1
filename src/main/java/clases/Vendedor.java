package clases;

public class Vendedor extends Empleado {
    private Integer porcentajeComision;
    private Integer totalVentas;

    public Vendedor(Integer dni, String nombre, String apellido, String email, Double sueldoBase, Integer porcentajeComision, Integer totalVentas) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcentajeComision = porcentajeComision;
        this.totalVentas = totalVentas;
    }

    @Override
    public Double getSueldo() {
        return sueldoBase + (porcentajeComision * (totalVentas / 100));
    }
}
