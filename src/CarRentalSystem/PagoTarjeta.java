package CarRentalSystem;
/**
 * 
 * @author hugog27 oct 2025
 */
public class PagoTarjeta implements ServicioPago {
    private String numTarjeta;

    public PagoTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.printf("[PagoTarjeta]: Procesando pago de \\$%.2f con tarjeta %s...\n", monto, numTarjeta);
        // Simulación: el pago siempre es exitoso si el monto es positivo
        if (monto > 0) {
            System.out.println("[PagoTarjeta]: Transacción Aprobada.");
            return true;
        } else {
            System.out.println("[PagoTarjeta]: Transacción Rechazada.");
            return false;
        }
    }
}
