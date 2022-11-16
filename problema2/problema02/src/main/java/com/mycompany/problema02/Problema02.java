/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aysanchez6
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoPedido;
        double cantidaPedido;
        double precioUnitario;
        double descuento = 20;
        double valorDescuento;

        System.out.println("ingrese cantidad del pedido");
        cantidaPedido = entrada.nextDouble();

        System.out.println("Ingrese precio unitario del articulo");
        precioUnitario = entrada.nextDouble();

        costoPedido = (cantidaPedido * precioUnitario);

        if (cantidaPedido > 50);
        {
            valorDescuento = (costoPedido * descuento) / 100;

            costoPedido = (costoPedido - valorDescuento);
        }
        System.out.printf("el costo del pedido es: \n" + costoPedido);

    }
}
