package org.example;

public class CalculadoraTexto {
    private int n1;
    private int n2;

    public CalculadoraTexto(String expresion) {
        String[] partes = expresion.split("\\+");
        // Asumimos que siempre hay dos partes y son números válidos
        n1 = Integer.parseInt(partes[0].trim());
        n2 = Integer.parseInt(partes[1].trim());
    }

    public int sumar() { return n1 + n2; }
    public int restar() { return n1 - n2; }
    public int multiplicar() { return n1 * n2; }

    public String generarResumen() {
        return "Suma: " + sumar() + "\n" +
                "Resta: " + restar() + "\n" +
                "Producto: " + multiplicar();
    }
}