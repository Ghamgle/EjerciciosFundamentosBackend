package org.scalian.ejerciciopropuesto;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class GestorProductos {

    public static void main(String[] args) {

        List<Producto> productoList = List.of (
                new Producto("Portátil", 1000, "tecnología"),
                new Producto("Pizzas", 20, "comida"),
                new Producto("Camiseta", 12, "moda"),
                new Producto("Auriculares", 150, "tecnología"),
                new Producto("Libro", 9, "educación"),
                new Producto("Smartphone", 700, "tecnología")
        );

        System.out.println( " --- Productos de más de 50€ ---");
         productoList.stream()
                 .filter( p -> p.precio() > 50)
                 .forEach(p -> System.out.println(p.nombre() + " - " + p.precio() + "€"));

        System.out.println( " --- Nombre Mayúscula ---");
        productoList.stream()
                .map( p -> p.nombre().toUpperCase())
                .forEach(System.out::println);

        System.out.println( " --- Productos ordenados ---");
        productoList.stream()
                .sorted(Comparator.comparingDouble(Producto::precio).reversed())
                .forEach(p -> System.out.println(p.nombre() + " - " + p.precio() + "€"));

        System.out.println( " --- Descuentos ---");
        productoList.stream()
                .forEach(p ->
                        System.out.println(p.nombre() + " - " + p.precio() + "€")
                );

    }
}
