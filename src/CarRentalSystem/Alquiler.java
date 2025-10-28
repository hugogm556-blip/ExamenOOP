/**
 * 
 */
package CarRentalSystem;

import java.time.LocalDate;

/**
 * Representa una transacción de alquiler específica.
 * Aplica Composición con Cliente y Vehiculo.
 */
public class Alquiler {
    private String idAlquiler;
    private Cliente cliente; // Composición
    private Vehiculo vehiculo; // Composición
    private int dias;
    private LocalDate fechaInicio;

    public Alquiler(String idAlquiler, Cliente cliente, Vehiculo vehiculo, int dias) {
        this.idAlquiler = idAlquiler;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.dias = dias;
        this.fechaInicio = LocalDate.now();
    }

    public double calcularCostoTotal() {
        // Uso de Polimorfismo: llama al método específico de Coche o SUV
        return vehiculo.calcularTarifaTotal(dias);
    }

    public void mostrarResumen() {
        System.out.println("\n--- Resumen del Alquiler ---");
        System.out.println("ID Alquiler: " + idAlquiler);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.print("Vehículo: ");
        vehiculo.mostrarDetalles(); // Uso de Polimorfismo
        System.out.println("Días alquilados: " + dias);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.printf("Costo Total Estimado: \\$%.2f\n", calcularCostoTotal());
        System.out.println("----------------------------");
    }

    // Getters
    public Vehiculo getVehiculo() { return vehiculo; }
}
