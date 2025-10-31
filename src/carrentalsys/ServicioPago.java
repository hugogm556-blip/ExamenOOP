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
//Fíjate en 'public interface ServicioPago'. Una INTERFAZ es como un CONTRATO
//o una plantilla que define qué métodos DEBEN tener las clases que la implementen.
//No tiene atributos (variables) ni código de implementación, solo firmas de métodos.
public interface ServicioPago {

 /**
  * Procesa el monto del pago.
  * @param monto Monto a pagar.
  * @return true si el pago fue exitoso, false si falló.
  */
 // Este es el único método que se exige.
 // La Interfaz dice: "Cualquier servicio de pago (Tarjeta, PayPal, Efectivo)
 // debe tener una función llamada 'procesarPago' que reciba un 'monto'
 // y devuelva un 'boolean' (verdadero o falso)".
 // ¡La Interfaz no se preocupa de CÓMO se hace el pago, solo de que se haga!
 boolean procesarPago(double monto);
}