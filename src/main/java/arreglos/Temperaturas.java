package arreglos;

import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Double[] temperaturas = new Double[24];
        Medidor medidor = new Medidor();
        medidor.ingresarTemperaturas(temperaturas);
        Double temperaturaMedia = medidor.hallarTemperaturaMedia(temperaturas);
        Double temperaturaMaxima = medidor.hallarTemperaturaMaxima(temperaturas);
        Double temperaturaMinima = medidor.hallarTemperaturaMinima(temperaturas);
        medidor.graficarTemperaturas(temperaturas, temperaturaMaxima, temperaturaMinima, temperaturaMedia);
    }
}

class Medidor {
    public void ingresarTemperaturas(Double[] temperaturas) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < temperaturas.length; i++) {
            System.out.println("Ingrese la temperatura a las " + i  + ":");
            temperaturas[i] = Double.parseDouble(in.nextLine());
        }
        in.close();
    }
    public Double hallarTemperaturaMaxima(Double[] temperaturas) {
        Double maxima = temperaturas[0];
        for (Double tempActual : temperaturas) {
            if (tempActual > maxima) {
                maxima = tempActual;
            }
        }
        return maxima;
    }
    public Double hallarTemperaturaMinima(Double[] temperaturas) {
        Double minima = temperaturas[0];
        for (Double tempActual : temperaturas) {
            if (tempActual < minima) {
                minima = tempActual;
            }
        }
        return minima;
    }
    public Double hallarTemperaturaMedia(Double[] temperaturas) {
        Double total = 0.0;
        for (Double temperatura : temperaturas) {
            total += temperatura;
        }
        return total / temperaturas.length;
    }

    public void graficarTemperaturas(Double[] temperaturas, Double maxima, Double minima, Double media) {
        for (int i = 0; i < temperaturas.length; i++) {
            Double tempActual = temperaturas[i];
            if(tempActual.equals(maxima)) {
                System.out.println(i + this.dibujarBarra(temperaturas[i]) + temperaturas[i] + " --> MAX");
            } else if(tempActual.equals(minima)) {
                System.out.println(i + this.dibujarBarra(temperaturas[i]) + temperaturas[i] + " --> MIN");
            } else {
                System.out.println(i + this.dibujarBarra(temperaturas[i]) + temperaturas[i]);
            }
        }
        System.out.println("Media: " + media);
    }

    private String dibujarBarra(Double temperatura) {
        StringBuilder porcentaje = new StringBuilder(" ");
        for (int i = 0; i < temperatura.intValue(); i++) {
            porcentaje.append("*");
        }
        porcentaje.append(" ");
        return porcentaje.toString();
    }
}
