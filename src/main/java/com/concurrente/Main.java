package com.concurrente;

public class Main {
    public static void main(String[] args) {
        int maximo = 40;
        int cantidadHilos = 4;
        int rango = maximo / cantidadHilos;
        int restantes = maximo % cantidadHilos;

        int inicio = 1;
        for (int i = 0; i < cantidadHilos; i++) {
            int termino = inicio + rango - 1;
            if (i == cantidadHilos - 1) {
                termino += restantes;
            }
            CuentaRepartida cuenta = new CuentaRepartida(inicio, termino);
            cuenta.start();
            inicio = termino + 1;
        }
    }
}
