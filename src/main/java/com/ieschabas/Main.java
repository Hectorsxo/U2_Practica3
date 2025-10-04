package com.ieschabas;

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

        // Pedir nombre y ciclo al usuario.
        System.out.print("Introduce tu nombre completo: ");
        String nombre = lector.nextLine();
        System.out.print("Introduce tu ciclo formativo: ");
        String ciclo = lector.nextLine();

        // Crear objeto de la clase GeneradorAlias.
        GeneradorAlias generador = new GeneradorAlias(nombre, ciclo);

        // Mostrar resultados
        System.out.println("--- RESULTADO ---");
        System.out.println("Alias generado: " + generador.generarAlias());
        System.out.println("Código numérico: " + generador.generarCodigoNumerico());

        System.out.println(); // Línea en blanco para separar actividades.

        /**
         * Actividad 2: Calculadora de Texto
         */
        System.out.println("\n=== Act 2: Calculadora de Texto ===");

        // Pedir expresión al usuario (usando el mismo Scanner).
        System.out.print("Introduce una expresión (ej. 5+3): ");
        String expr = lector.nextLine();

        // Crear objeto de la clase CalculadoraTexto.
        CalculadoraTexto calc = new CalculadoraTexto(expr);

        // Mostrar resultado.
        System.out.println("---RESULTADO ---");
        System.out.println(calc.generarResumen());

        /**
         * Actividad 3: Formateador de factura.
         */

        System.out.println("\n=== Actividad 3: Formateador de Factura ===");

        // Pedir datos al usuario.
        System.out.print("Introduce el nombre del producto: ");
        String nombre1 = lector.nextLine();

        System.out.print("Introduce el precio base (ej. 12,50): ");
        double precio = lector.nextDouble();

        System.out.print("Introduce el porcentaje de IVA (ej. 21): ");
        double iva = lector.nextDouble();

        // Crear objeto (según Unidad 2: instanciación con new).
        FormateadorFactura factura = new FormateadorFactura(nombre1, precio, iva);

        // Mostrar el ticket.
        System.out.println("--- TICKET ---");
        System.out.println(factura.generarTicket());


        /**
         * Actividad 4: Ficha personal.
         */
        lector.nextLine();
        System.out.println("\n=== Actividad 4: Ficha Personal ===");

        //Pedir datos al usuario.
        System.out.println("Introduce los datos en el formato:");
        System.out.println("\"Nombre Apellido - YYYY-MM-DD - Ciudad\"");
        System.out.print("Ejemplo: Ana López - 2005-03-15 - Madrid\n→ ");

        String entrada = lector.nextLine(); // Lee toda la línea escrita por el usuario

        //Crear objeto con los datos introducidos.
        FichaPersonal ficha = new FichaPersonal(entrada);

        // Mostrar los datos formateados de la ficha
        System.out.println("--- FICHA PERSONAL ---");
        System.out.println(ficha.generarEtiqueta());



        /**
         * Actividad 5: Normalizador de registro.
         */


        System.out.println("\n=== Actividad 5: Normalizador de Registro ===");

        System.out.print("Introduce tu nombre de usuario: "); // Lee el nombre de usuario completo
        String usuario = lector.nextLine();

        System.out.print("Introduce tu correo electrónico: "); // Lee el correo escrito por el usuario
        String correo = lector.nextLine();

        System.out.print("Introduce tu número de teléfono: "); // Lee el número de teléfono como texto
        String telefono = lector.nextLine();

        // Crea un objeto de la clase NormalizadorRegistro con los datos introducidos
        NormalizadorRegistro normalizador = new NormalizadorRegistro(usuario, correo, telefono);

        // Muestra el resumen formateado con usuario, correo y teléfono normalizados
        System.out.println("--- RESULTADO ---");
        System.out.println(normalizador.generarResumen());

    }
}