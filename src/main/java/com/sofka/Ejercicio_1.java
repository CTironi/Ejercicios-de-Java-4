package com.sofka;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Integer numeros[] = new Integer[5];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un número entero para la posición: " + i);
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Datos del array");
        for (int i = 0; i < 5; i++) {
            System.out.println("[" + i + "]" + " = " + numeros[i]);
        }
    }
}