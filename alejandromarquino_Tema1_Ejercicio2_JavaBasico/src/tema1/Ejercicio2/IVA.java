package tema1.Ejercicio2;

import java.util.Scanner;

public class IVA {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce el precio del artículo");
        double precio = sn.nextDouble();
        System.out.println("Introduce el tipo de IVA");
        double tipoIva = sn.nextDouble();

        double iva = tipoIva / 100;
        double precioNeto = precio * (1+iva);


        System.out.println("El precio con IVA incluido es: " + precioNeto);

    }
}
