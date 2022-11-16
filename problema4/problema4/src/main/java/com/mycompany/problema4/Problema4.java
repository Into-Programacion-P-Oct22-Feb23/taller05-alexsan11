/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aysanchez6
 */
public class Problema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numeroDias;
        double precioDiario;
        double subtotalPagar;
        double pagarTotal = 0;
        double descuento1 = 10;
        double descuento2 = 15;
        double descuento3 = 20;
        double valordescuento = 0;

        System.out.println("Ingrese el numero de dias que se quedo en "
                + "el hospedaje");
        numeroDias = entrada.nextInt();

        System.out.println("ingrese el precio diario de la habitacion");
        precioDiario = entrada.nextDouble();

        subtotalPagar = (precioDiario * numeroDias);

        if (numeroDias > 5) {
            valordescuento = (subtotalPagar * descuento1) / 100;
            pagarTotal = (subtotalPagar - valordescuento);

            System.out.printf("subtotal a pagar es:\n%f\n descuento de:\n%f\n"
                    + " Total a pagar es:\n%f\n", subtotalPagar,
                    +valordescuento, pagarTotal);
        } else {
            if (numeroDias > 10) {
                valordescuento = (subtotalPagar * descuento2) / 100;
                pagarTotal = (subtotalPagar - valordescuento);

                System.out.printf("subtotal a pagar es:\n%f\n descuento de:\n%f\n"
                        + " Total a pagar es:\n%f\n", subtotalPagar,
                        +valordescuento, pagarTotal);
            } else {
                if (numeroDias > 15) {
                    valordescuento = (subtotalPagar * descuento3) / 100;
                    pagarTotal = (subtotalPagar - valordescuento);

                    System.out.printf("subtotal a pagar es:\n%f\n descuento de:"
                            + "\n%f\n"
                            + " Total a pagar es:\n%f\n", subtotalPagar,
                            +valordescuento, pagarTotal);

                }
            }
        }
        // System.out.println("subtotal a pagar es:"
        //      + subtotalPagar);
        //System.out.println("con un descuento de:" + valordescuento);
        // System.out.println("el total a pagar es:" + pagarTotal);

    }
}
