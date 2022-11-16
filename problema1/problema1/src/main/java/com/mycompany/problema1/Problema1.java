/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aysanchez6
 */
public class Problema1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int edad;
        double costoKilovatio;
        double kilovationumero;
        double costoPlanilla;
        double descuento = 10;
        double valordescuento;

        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();

        System.out.println("Ingrese el costo kilovatio/hora");
        costoKilovatio = entrada.nextDouble();

        System.out.println("Ingrese el numero consumido de kilovatios por "
                + "al mes");
        kilovationumero = entrada.nextDouble();

        costoPlanilla = costoKilovatio * kilovationumero;

        if (edad > 65) {
            valordescuento = (costoPlanilla * descuento) / 100;

            costoPlanilla = (costoPlanilla - valordescuento);
        }
        // System.out.println("el valor a cancelar es:" + costoPlanilla);    
        System.out.printf("el valor a cancelar es: \n" + costoPlanilla);
    }
}
