package com.ieschabas;

/**
 * Programa que permite crear un alias académico y un código numérico basado en el nombre completo y ciclo educativo.
 * @author Héctor Crespo
 * @version 1.0
 */
public class GeneradorAlias {
    /**
     * Almacena el nombre y el ciclo (ej,: "DAM", "DAW") del estudiante.
     */
    private String nombreCompleto;
    private String ciclo;

    /**
     * Constructor por defecto de la clase GeneradorAlias.
     */
    public GeneradorAlias() {
        this.nombreCompleto = "";
        this.ciclo = "";
    }

    /**
     * Constructor sobrecargado que recibe el nombre y el ciclo.
     * @param nombreCompleto Nombre completo del estudiante.
     * @param ciclo Ciclo académico del estudiante.
     */
    public GeneradorAlias(String nombreCompleto, String ciclo) {
        this.nombreCompleto = nombreCompleto;
        this.ciclo = ciclo;
    }

    /**
     * getter
     * @return Devuelve el nombre completo del estudiante.
     */
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    /**
     * getter
     * @param nombreCompleto Asigna un nuevo nombre.
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * getter
     * @return Devuelve el ciclo académico del estudiante.
     */
    public String getCiclo() {
        return this.ciclo;
    }

    /**
     * setter
     * @param ciclo Asigna un nuevo ciclo.
     */
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    /**
     * Genera un alias académico basado en el nombre y ciclo.
     * @return Alias generado con el formato: InicialNombre + InicialApellido + "_" + Ciclo
     */
    public String generarAlias() {

        String nombreSinEspacios = this.nombreCompleto.trim(); // Elimina espacios al inicio y final
        String cicloSinEspacios = this.ciclo.trim().toUpperCase(); // Limpia y convierte ciclo a mayúsculas

        String[] partes = nombreSinEspacios.split("\\s+"); // Divide el nombre en palabras por espacios

        String inicialNombre = partes[0].substring(0, 1).toUpperCase(); // Toma la inicial del primer nombre

        String inicialApellido = ""; // Variable para guardar la inicial del apellido

        // Si hay al menos un apellido
        if (partes.length > 1) {
            inicialApellido = partes[1].substring(0, 1).toUpperCase();
        }

        String cicloCorto = cicloSinEspacios.length() >= 3 ? // Verifica si el ciclo tiene al menos 3 letras
                cicloSinEspacios.substring(0, 3) : cicloSinEspacios; // Toma las primeras 3 letras o el ciclo completo
        return inicialNombre + inicialApellido + "_" + cicloCorto;
    }

    /**
     * Genera un código numérico basado en la longitud del nombre y ciclo.
     * @return Número calculado (longitud total * 7)
     */
    public int generarCodigoNumerico() {
        int longitudNombre = this.nombreCompleto.length();
        int longitudCiclo = this.ciclo.length();
        return (longitudNombre + longitudCiclo) * 7;
    }
    /**
     * Devuelve una representación en texto del alias y código numérico.
     * @return Cadena con el alias y el código generado
     */
    @Override
    public String toString() {
        return "Alias: " + generarAlias() + " | Código numérico: " + generarCodigoNumerico(); // Construye la cadena de salida

    }
}
