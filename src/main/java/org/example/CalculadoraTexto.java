package org.example;

/**
 * Programa que recibe una expresión escrita en el formato "n1+n2" y realiza operaciones aritméticas.
 * @author Héctor Crespo
 * @version 1.0
 */
public class CalculadoraTexto {

    /**
     * Números extraídos de la expresión.
     */
    private int n1;
    private int n2;

    /**
     * Constructor que recibe una expresión en formato texto, como "5+3".
     * Separa la expresión por el signo "+" y convierte cada parte en entero.
     * @param expresion expresion Cadena con formato "numero+numero"
     */
    public CalculadoraTexto(String expresion) {
        String[] partes = expresion.split("\\+");

        n1 = Integer.parseInt(partes[0].trim()); // Convierte la primera parte a entero
        n2 = Integer.parseInt(partes[1].trim()); // Convierte la segunda parte a entero
    }

    /**
     * Suma de los números ingresados.
     * @return n1 + n2
     */
    public int sumar() { return n1 + n2; }

    /**
     * Suma de los números ingresados.
     * @return n1 - n2
     */
    public int restar() { return n1 - n2; }

    /**
     * Suma de los números ingresados.
     * @return n1 * n2
     */
    public int multiplicar() { return n1 * n2; }

    /**
     * Genera un resumen con los resultados de las operaciones básicas.
     * @return Cadena con los resultados de suma, resta y multiplicación
     */
    public String generarResumen() {
        return "Suma: " + sumar() + "\n" +
                "Resta: " + restar() + "\n" +
                "Producto: " + multiplicar();
    }
}