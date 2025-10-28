/**
 *
 */
package carrentalsys;

/**
 * @author hugog27 oct 2025
 */
/**
 * Interfaz para implementar diferentes métodos de pago.
 * Aplica Abstracción.
 */
public interface ServicioPago {
    /**
     * Procesa el monto del pago.
     * @param monto Monto a pagar.
     * @return true si el pago fue exitoso, false si falló.
     */
    boolean procesarPago(double monto);
}