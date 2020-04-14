package clases;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        Administrativo adm1 = new Administrativo(39486458,
                "Lucas",
                "Nahuel",
                "lucas@gmail.com",
                44000.00,
                48,
                240
                );
        Administrativo adm2 = new Administrativo(41323555,
                "Agustina",
                "Zalazar",
                "agus@gmail",
                35300.20,
                20,
                240);
        Vendedor vend1 = new Vendedor(3743234,
                "Adolfo",
                "Martinez",
                "adolf@gmail.com",
                25000.50,
                38,
                4070);
        empleados.add(adm1);
        empleados.add(adm2);
        empleados.add(vend1);

        empleados.forEach(emp -> {
            System.out.printf("%.2f%n", emp.getSueldo());
        });
    }
}
