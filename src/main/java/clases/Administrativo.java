package clases;

public class Administrativo extends Empleado {
    private Integer hsExtra;
    private Integer hsMes;

    public Administrativo(Integer dni, String nombre, String apellido, String email, Double sueldoBase, Integer hsExtra, Integer hsMes) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }

    @Override
    public Double getSueldo() {
        return sueldoBase * ((hsExtra * 1.5) + hsMes) / hsMes;
    }
}
