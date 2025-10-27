/**
 * 
 */
package CarRentalSystem;

import java.time.LocalDate;

/**
 * Clase que registra el detalle de un pago.
 * Esta clase demuestra Encapsulación y es parte de la COMPOSICIÓN con la clase Rental.
 */
public class Rental {

    // --- Atributos (Campos Privados: Encapsulación) ---

    /** Monto final pagado por el alquiler. */
    private double amount;
    
    /** Fecha en que se procesó el pago. */
    private LocalDate paymentDate;
    
    /** Método de pago utilizado (e.g., "Card", "Cash", "Transferencia"). */
    private String method;
    
    /** Empleado que registró o procesó el pago. */
    private Employee processedBy; // Requiere que Employee exista en este paquete

    // --- Constructor ---

    /**
     * Constructor para inicializar un nuevo objeto Payment.
     * @param amount El monto total de la transacción.
     * @param paymentDate La fecha de la transacción.
     * @param method El método de pago.
     * @param processedBy El empleado que gestionó el pago.
     */
    public Rental(double amount, LocalDate paymentDate, String method, Employee processedBy) {
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.method = method;
        this.processedBy = processedBy;
    }

    // --- Getters (Para consultar los datos del pago) ---

    public double getAmount() {
        return amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public String getMethod() {
        return method;
    }

    public Employee getProcessedBy() {
        return processedBy;
    }

    // Nota: Generalmente no se necesitan setters para una clase Payment.
    
}
