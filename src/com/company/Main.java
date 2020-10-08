package com.company;

public class Main {

    public static void main(String[] args) {
        long tiempoDeInicio = System.currentTimeMillis();
        CustomThread t = new CustomThread(1000);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long tiempoDeFin = System.currentTimeMillis();

        System.out.println("He terminado en " + (tiempoDeFin - tiempoDeInicio) + " milisegundos");

        try {
            CustomThread t1 = new CustomThread(1000);
            t1.setName("Hilo1");
            t1.start();
            t1.join();
            CustomThread t2 = new CustomThread(2000);
            t2.setName("Hilo2");
            t2.start();
            t2.join();
            CustomThread t3 = new CustomThread(3000);
            t3.setName("Hilo3");
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
