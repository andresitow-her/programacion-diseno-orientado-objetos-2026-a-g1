package com.corhuila.poo.semana2;

public class App {

    public static void main(String[] arg) {

        Producto p1 = new Producto("Laptop", 2500);
        Producto p2 = new Producto("Celular", 1200);
        Producto p3 = new Producto("Tablet", 800);

        System.out.println("=== OBJETOS DIFERENTES ===");
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();

        System.out.println("\nReferencias en memoria:");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

        p2 = p1;

        System.out.println("\n=== MISMA REFERENCIA ===");
        System.out.println("Después de hacer p2 = p1:");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);


        p2.nombre = "Laptop Gamer";
        p2.precio = 3000;

        System.out.println("\nCambio hecho desde p2:");
        p1.mostrarInfo();
        p2.mostrarInfo();

        Producto Null = null;

        System.out.println("\n=== REFERENCIA NULL ===");
        System.out.println("Null = " + null);
    }
}