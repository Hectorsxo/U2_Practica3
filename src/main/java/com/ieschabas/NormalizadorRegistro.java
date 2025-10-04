package com.ieschabas;

/**
 * Programa que permite normalizar y formatear datos de registro de un usuario.
 * Contiene funciones para limpiar el nombre de usuario, correo y teléfono,  además de generar un resumen con la información formateada.
 * @author Héctor Crespo
 * @version 1.0
 */
public class NormalizadorRegistro {

    /**
     * Datos del usuario.
     */
    private String usuario;
    private String correo;
    private String telefono;

    /**
     * Constructor por defecto de la clase NormalizadorRegistro.
     */
    public NormalizadorRegistro() {
        this.usuario = "anonimo";
        this.correo = "anonimo@ejemplo.com";
        this.telefono = "000000000";
    }

    /**
     * Constructor sobrecargado.
     * @param usuario Nombre de usuario.
     * @param correo Correo electrónico.
     * @param telefono Número de teléfono.
     */
    public NormalizadorRegistro(String usuario, String correo, String telefono) {
        this.usuario = usuario;
        this.correo = correo;
        this.telefono = telefono;
    }


    /**
     * getter
     * @return Devuelve el usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * getter
     * @return Devuelve el correo electrónico.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * getter
     * @return Devuelve el número de teléfono.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * setter
     * @param usuario Asigna un nuevo usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * setter
     * @param correo Asigna un nuevo correo electrónico.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * setter
     * @param telefono Asigna un nuevo número de teléfono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Formatea el usuario:
     * - Elimina espacios al inicio y final
     * - Convierte a minúsculas
     * @return Usuario formateado.
     */

    public String formatearUsuario() {
        String usuarioLimpio = usuario.trim().toLowerCase();
        if (usuarioLimpio.isEmpty()) {
            return "Anonimo";
        }

        char primera = Character.toUpperCase(usuarioLimpio.charAt(0));
        String resto = usuarioLimpio.substring(1);
        return primera + resto;
    }

    /**
     * Convierte el correo a un formato estándar:
     * - Todo en minúsculas
     * - Sin espacios extra
     * @return Correo formateado.
     */
    public String formatearCorreo() {
        return correo.trim().toLowerCase();
    }

    /**
     * Extrae el prefijo del teléfono (primeros 3 dígitos).
     * @return Prefijo numérico o "000" si no tiene suficiente longitud.
     */
    public String extraerPrefijo() {
        String telLimpio = telefono.trim();
        if (telLimpio.length() >= 3) {
            return telLimpio.substring(0, 3);
        } else {
            return "000"; // valor por defecto si el teléfono es muy corto
        }
    }

    /**
     * Genera una clave numérica simple sumando las longitudes de los campos de usuario, correo y teléfono.
     * @return Clave generada en forma de número entero.
     */
    public int generarClaveNumerica() {
        return usuario.length() + correo.length() + telefono.length();
    }

    /**
     * Método que genera un resumen con todos los datos ya formateados.
     * @return Cadena multilínea con usuario, correo, prefijo y clave.
     */
    public String generarResumen() {
        return "Usuario formateado: " + formatearUsuario() + "\n" +
                "Correo canónico: " + formatearCorreo() + "\n" +
                "Prefijo del teléfono: " + extraerPrefijo() + "\n" +
                "Clave numérica: " + generarClaveNumerica();
    }
}