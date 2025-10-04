package com.ieschabas;

/**
 * Programa que recibe el nombre de un producto, su precio base y el porcentaje de IVA.
 * @author Héctor Crespo
 * @version 1.0
 */
public class FormateadorFactura {

    /**
     * Nombre, precio base y Iva aplicado al producto (ej.: 21 para 21%).
     */
    private String nombreProducto;
    private double precioBase;
    private double porcentajeIva;

    /**
     * Constructor por defecto de la clase FormateadorFactura.
     */
    public FormateadorFactura() {
        this.nombreProducto = "Producto";
        this.precioBase = 0.0;
        this.porcentajeIva = 0.0;
    }

    /**
     * Constructor sobrecargado
     * @param nombreProducto Nombre del producto
     * @param precioBase Precio sin impuestos
     * @param porcentajeIva IVA en porcentaje
     */
    public FormateadorFactura(String nombreProducto, double precioBase, double porcentajeIva) {
        this.nombreProducto = nombreProducto;
        this.precioBase = precioBase;
        this.porcentajeIva = porcentajeIva;
    }

    /**
     * @return Devuelve el nombre del producto.
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @return Devuelve el precio base.
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * @return Devuelve el porcentaje de IVA.
     */
    public double getPorcentajeIva() {
        return porcentajeIva;
    }

    /**
     * @param nombreProducto Asigna un nuevo nombre al producto.
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @param precioBase Asigna un nuevo precio base.
     */
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    /**
     * @param porcentajeIva Adigna un nuevo porcentaje en IVA.
     */

    public void setPorcentajeIva(double porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    /**
     * Genera una línea simple para mostrar en el ticket.
     * @return Texto en formato "Producto: 10.0 €".
     */
    public String lineaTicket() {
        return nombreProducto + ": " + precioBase + " €";
    }

    /**
     * Calcula el precio final sumando el IVA al precio base.
     * @return Total con IVA incluido.
     */
    public double calcularTotalConIva() {
        double iva = precioBase * (porcentajeIva / 100);
        return precioBase + iva;
    }

    /**
     * Genera un ticket completo con presentación básica.
     * @return Cadena con formato multilínea lista para imprimir.
     */
    public String generarTicket() {
        double total = calcularTotalConIva();
        double ivaImporte = precioBase * (porcentajeIva / 100);
        return lineaTicket() + "\n" +
                "IVA (" + porcentajeIva + "%): " + ivaImporte + " €\n" +
                "TOTAL: " + total + " €";
    }
}