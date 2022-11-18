package com.sofka;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Integer numeros[] = new Integer[20];
        String numpar = "", numimpar = "";

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.println("Numeros elegidos: " + numeros[i]);
        }

        for (Integer item : numeros) {
            if (item % 2 == 0)
                numpar += item + ", ";
            else numimpar += item + ", ";
        }
        System.out.println("Numeros par: " + numpar + "\nNumeros impar: " + numimpar);
    }
}
