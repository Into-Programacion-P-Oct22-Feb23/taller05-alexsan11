/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aysanchez6
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double impuestoPagar = 0;
        double precioVenta;
        double impuesto;
        double impuesto1 = 20;
        double impuesto2 = 30;
        double impuesto3 = 15;
        double impuesto4 = 8;

        System.out.println("Ingrese la marca del vehiculo");
        marca = entrada.nextLine();

        System.out.println("ingrese el origen del vehiculo");
        origen = entrada.nextLine();

        System.out.println("ingrese el costo del vehiculo");
        costo = entrada.nextDouble();

        if (origen.equals("Alemania")) {
            impuestoPagar = (impuestoPagar * impuesto1) / 100;
            precioVenta = (costo + impuestoPagar);

            System.out.printf("El impuesto a pagar es:\n%f\n El precio de"
                    + "venta es:\n%2f\n", impuestoPagar, costo);
        } else {
            if (origen.equals("Japon")) {
                impuestoPagar = (impuestoPagar * impuesto2) / 100;
                precioVenta = (costo + impuestoPagar);

                System.out.printf("El impuesto a pagar es:\n%f\n El precio de"
                        + "venta es:\n%2f\n", impuestoPagar, costo);
            } else {

                if (origen.equals("Italia")) {
                    impuestoPagar = (impuestoPagar * impuesto3) / 100;
                    precioVenta = (costo + impuestoPagar);

                 System.out.printf("El impuesto a pagar es:\n%f\n El precio de"
                         + "venta es:\n%2f\n", impuestoPagar, costo);
                } else {

                    if (origen.equals("USA")) {
                        impuestoPagar = (impuestoPagar * impuesto4) / 100;
                        precioVenta = (costo + impuestoPagar);
                System.out.printf("El impuesto a pagar es:\n%f\n El precio de"
                        + "venta es:\n%2f\n", impuestoPagar, costo);
                    }

                }

            }

        }

    }
}
