package com.ieschabas;

import org.example.CalculadoraTexto;
import org.example.FormateadorFactura;

import java.util.Scanner;
/**
 * Práctica 3 Unidad 2
 * @author Héctor Crespo
 * @version 1.0
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Un único Scanner para todo el programa
        Scanner lector = new Scanner(System.in);

        /**
         * Actividad 1: Generador de Alias Académico
         */
        System.out.println("=== Act 1: Generador de Alias Académico ===");

        // Pedir nombre y ciclo al usuario
        System.out.print("Introduce tu nombre completo: ");
        String nombre = lector.nextLine();
        System.out.print("Introduce tu ciclo formativo: ");
        String ciclo = lector.nextLine();

        // Crear objeto de la clase GeneradorAlias
        GeneradorAlias generador = new GeneradorAlias(nombre, ciclo);

        // Mostrar resultados
        System.out.println("--- Resultados ---");
        System.out.println("Alias generado: " + generador.generarAlias());
        System.out.println("Código numérico: " + generador.generarCodigoNumerico());

        System.out.println(); // Línea en blanco para separar actividades

        /**
         * Actividad 2: Calculadora de Texto
         */
        System.out.println("=== Act 2: Calculadora de Texto ===");

        // Pedir expresión al usuario (usando el mismo Scanner)
        System.out.print("Introduce una expresión (ej. 5+3): ");
        String expr = lector.nextLine();

        // Crear objeto de la clase CalculadoraTexto
        CalculadoraTexto calc = new CalculadoraTexto(expr);

        // Mostrar resultado
        System.out.println("--- Resultado ---");
        System.out.println(calc.generarResumen());

        /**
         * Actividad 3: Formateador de factura.
         */

        System.out.println("=== Actividad 3: Formateador de Factura ===");

        // Pedir datos al usuario
        System.out.print("Introduce el nombre del producto: ");
        String nombre1 = lector.nextLine();

        System.out.print("Introduce el precio base (ej. 12,50): ");
        double precio = lector.nextDouble();

        System.out.print("Introduce el porcentaje de IVA (ej. 21): ");
        double iva = lector.nextDouble();

        // Crear objeto (según Unidad 2: instanciación con new)
        FormateadorFactura factura = new FormateadorFactura(nombre1, precio, iva);

        // Mostrar el ticket
        System.out.println("--- TICKET ---");
        System.out.println(factura.generarTicket());
    }
}