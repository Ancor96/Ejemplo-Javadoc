package com.ejemplo.calculadora;

/**
 * Proporciona operaciones matemáticas básicas.
 * <p>
 * Esta clase sirve como ejemplo de cómo estructurar comentarios Javadoc
 * estándar para su correcta visualización e integración en repositorios de GitHub.
 * </p>
 *
 * @author Ancor Ramos Pérez
 * @version 1.0
 */
public class Calculadora {

    /**
     * Calcula el precio final de un producto aplicando un porcentaje de descuento.
     *
     * @param precioBase El precio original del producto antes de impuestos o descuentos. Debe ser mayor o igual a 0.
     * @param porcentajeDescuento El porcentaje de descuento a aplicar (por ejemplo, 15.0 para un 15%).
     * @return El precio final tras restar el descuento calculado.
     * @throws IllegalArgumentException Si el precio base o el descuento son negativos.
     */
    public double calcularPrecioConDescuento(double precioBase, double porcentajeDescuento) {
        if (precioBase < 0 || porcentajeDescuento < 0) {
            throw new IllegalArgumentException("El precio y el descuento no pueden ser negativos.");
        }
        double descuento = precioBase * (porcentajeDescuento / 100.0);
        return precioBase - descuento;
    }

    /**
     * Verifica si un número entero es par.
     *
     * @param numero El número entero que se desea evaluar.
     * @return {@code true} si el número es divisible entre 2; {@code false} en caso contrario.
     */
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
