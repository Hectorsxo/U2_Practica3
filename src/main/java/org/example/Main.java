package com.ieschabas;

import java.util.Scanner;
/**
 * Práctica 3 Unidad 2
 * @author Héctor Crespo
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Uso de la clase GeneradorAlias (act1).
         */

        //Creación del objeto Scanner
        Scanner lector = new Scanner(System.in);

        System.out.println("=== Act 1: Generador de Alias Académico ===");

        //Pedir nombre y ciclo al usuario.
        System.out.print("Introduce tu nombre completo: ");
        String nombre = lector.nextLine();
        System.out.print("Introduce tu ciclo formativo: ");
        String ciclo = lector.nextLine();

        // Creamos un objeto de la clase GeneradorAlias con los datos introducidos.
        GeneradorAlias generador = new GeneradorAlias(nombre, ciclo);

        //Muestra los resultados.
        System.out.println("--- Resultados ---");
        System.out.println("Alias generado: " + generador.generarAlias());
        System.out.println("Código numérico: " + generador.generarCodigoNumerico());

        lector.close();
    }
}
