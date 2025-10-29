/**
 * 
 */
package CarRentalSystem;

/**
 * @author hugog27 oct 2025
 */
public class Payment {
    private double amount;
    private String currency;
    private String paymentMethod;
    private String status;

}

// Constructor
public Payment(double amount, String currency, String paymentMethod) {
    this.amount = amount;
    this.currency = currency;
    this.paymentMethod = paymentMethod;
    this.status = "Pendiente";
}

// Getters y setters
public double getAmount() {
    return amount;
}

public void setAmount(double amount) {
    this.amount = amount;
}

public String getCurrency() {
    return currency;
}

public void setCurrency(String currency) {
    this.currency = currency;
}

public String getPaymentMethod() {
    return paymentMethod;
}

public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}


// Método para procesar el pago
public void processPayment() {
    // Aquí iría la lógica para procesar el pago
    System.out.println("Procesando pago de " + amount + " " + currency + " mediante " + paymentMethod);
    this.status = "Completado";
}


@Override
public String toString() {
    return "Payment{" +
            "amount=" + amount +
            ", currency='" + currency + '\'' +
            ", paymentMethod='" + paymentMethod + '\'' +
            ", status='" + status + '\'' +
            '}';
}
}

 