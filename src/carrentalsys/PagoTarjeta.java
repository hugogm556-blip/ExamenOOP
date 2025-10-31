package carrentalsys;
/**
 *
 * @author hugog27 oct 2025
 */
//Esta es la clase COCHE. Fíjate en 'extends Vehiculo'.
//Esto significa que Coche HEREDA todas las características (atributos y métodos)
//que ya están definidos en la clase Vehiculo (como matrícula, marca, etc.).
public class PagoTarjeta implements ServicioPago {
 // ----------------------------------------------------------------------
 // Implementación de Interfaz
 // ----------------------------------------------------------------------
 // Fíjate en 'implements ServicioPago'. Esto NO es herencia.
 // Esto significa que la clase 'PagoTarjeta' PROMETE que va a implementar
 // todos los métodos que estén definidos en la 'Interfaz ServicioPago'.

 // ----------------------------------------------------------------------
 // Atributo específico
 // ----------------------------------------------------------------------
 // La tarjeta necesita saber el número de tarjeta.
 private String numTarjeta;

 // ----------------------------------------------------------------------
 // Constructor (Método para crear un nuevo objeto PagoTarjeta)
 // ----------------------------------------------------------------------
 public PagoTarjeta(String numTarjeta) {
     // Inicializamos el número de tarjeta que se usará para este pago.
     this.numTarjeta = numTarjeta;
 }

 // ----------------------------------------------------------------------
 // Métodos (Acciones que puede realizar un objeto PagoTarjeta)
 // ----------------------------------------------------------------------

 // @Override es OBLIGATORIO porque estamos cumpliendo la promesa
 // de implementar el método 'procesarPago' que exige la Interfaz 'ServicioPago'.
 @Override
 public boolean procesarPago(double monto) {
     // 1. Muestra un mensaje de que el pago está en curso.
     System.out.printf("[PagoTarjeta]: Procesando pago de \\$%.2f con tarjeta %s...\n", monto, numTarjeta);

     // 2. Simulación de la lógica de pago real.
     // En un sistema real, aquí habría código que contacta a un banco.
     // Aquí, simplemente simulamos: el pago siempre es exitoso si el monto es positivo.
     if (monto > 0) {
         System.out.println("[PagoTarjeta]: Transacción Aprobada.");
         return true; // Devolvemos 'true' (verdadero) si fue exitoso.
     } else {
         System.out.println("[PagoTarjeta]: Transacción Rechazada.");
         return false; // Devolvemos 'false' (falso) si falló.
     }
 }
}
