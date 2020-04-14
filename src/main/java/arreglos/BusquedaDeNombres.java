package arreglos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusquedaDeNombres {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        Buscador buscador = new Buscador();
        buscador.ingresarNombres(3, nombres);
        buscador.buscarNombresPorInicial(nombres);
    }
}
class Buscador {
    private Scanner in = new Scanner(System.in);

    public void ingresarNombres(int cantidadDeNombres, List<String> lista) {
        while(cantidadDeNombres>0) {
            System.out.println("Ingrese el nombre y apellido de su compañero: ");
            lista.add(in.nextLine());
            cantidadDeNombres -= 1;
        }
    }

    private List<String> nombresQueEmpiezanCon(char inicial, List<String> lista) {
        List<String> aparecen = new ArrayList<>();
        lista.forEach(nombre -> {
            if(nombre.toLowerCase().charAt(0) == inicial)
                aparecen.add(nombre);
        });
        return aparecen;
    }

    public void buscarNombresPorInicial(List<String> lista) {
        String userInput = "";
        while(!userInput.equals("fin")) {
            System.out.println("Ingrese una inicial para buscar nombres o ingrese FIN para terminar.");
            userInput = in.nextLine().toLowerCase();
            this.imprimirLista(this.nombresQueEmpiezanCon(userInput.charAt(0), lista));
        }
    }

    private void imprimirLista(List<String> lista) {
        for(String nombre : lista) {
            System.out.println(nombre);
        }
    }

}
