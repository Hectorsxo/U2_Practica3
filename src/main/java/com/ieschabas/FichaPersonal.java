package com.ieschabas;

/**
 * Programa que simula una ficha personal y recibe una cadena con el formato: "Nombre Apellido - YYYY-MM-DD - Ciudad".
 * @author Héctor Crespo
 * @version 1.0
 */
public class FichaPersonal {

    /**
     * Datos de la persona.
     */
    private String nombre;
    private String apellido;
    private String fechaNacimiento; // formato: "YYYY-MM-DD"
    private String ciudad;

    /**
     * Constructor por defecto de la clase FichaPersonal.
     */
    public FichaPersonal() {
        this.nombre = "";
        this.apellido = "";
        this.fechaNacimiento = "";
        this.ciudad = "";
    }

    /**
     * Constructor que recibe una cadena con el formato: "Nombre Apellido - YYYY-MM-DD - Ciudad".
     * @param entrada Texto con los datos personales separados por " - ".
     */
    public FichaPersonal(String entrada) {
        // Dividir la cadena por " - "
        String[] partes = entrada.split(" - ");

        // Extraer nombre y apellido"
        String nombreCompleto = partes[0];
        String[] nombres = nombreCompleto.split(" ");
        this.nombre = nombres[0];
        if (nombres.length > 1) {
            this.apellido = nombres[1];
        } else {
            this.apellido = "Sin apellido";
        }

        // Extraer fecha de nacimiento y ciudad
        this.fechaNacimiento = partes[1];
        this.ciudad = partes[2];
    }

    /**
     * getter
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * getter
     * @return Apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * getter
     * @return Fecha de nacimiento en formato "YYYY-MM-DD".
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * getter
     * @return Ciudad de residencia.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Obtiene el año de nacimiento tomando los 4 primeros caracteres de la fecha.
     * @return Año de nacimiento como número entero.
     */
    public int getAnioNacimiento() {
        String anioStr = fechaNacimiento.substring(0, 4);
        return Integer.parseInt(anioStr);
    }

    /**
     * Calcula la edad aproximada usando un año actual fijo (2025).
     * @return Edad calculada en años.
     */
    public int calcularEdad() {
        return 2025 - getAnioNacimiento();
    }

    /**
     * Genera un texto con la información de la persona en formato legible.
     * @return Cadena multilínea con los datos formateados.
     */
    public String generarEtiqueta() {
        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Año de nacimiento: " + getAnioNacimiento() + "\n" +
                "Edad aproximada: " + calcularEdad() + " años\n" +
                "Ciudad: " + ciudad;
    }
}