package com.concurrente;

public class CuentaRepartida extends Thread {
    int inicio;
    int termino;
    public CuentaRepartida(int inicio, int termino) {
        this.inicio = inicio;
        this.termino = termino;
    }
    @Override
    public void run() {
        for (int i = inicio; i < termino; i++) {
            System.out.println(this.getName()+": "+i);
        }
        System.out.println(this.getName()+" finalizado");
    }
}
