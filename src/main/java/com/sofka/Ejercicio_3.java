package com.sofka;

public class Ejercicio_3 {

    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            int div = 0;
            for (int p = 1; p <= i; p++) {
                if (i % p == 0) {
                    div++;
                }
            }
            if (div == 2) {
                System.out.println("Numero primo: "+i);
            }
        }
    }
}
