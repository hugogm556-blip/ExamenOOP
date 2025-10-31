/**
 *
 */
package carrentalsys;

import java.time.LocalDate;

/**
 * Representa una transacción de alquiler específica.
 * Aplica Composición con Cliente y Vehiculo.
 */
// Esta clase define lo que es un 'Alquiler'. Es como el contrato de arrendamiento.
public class Alquiler {
    // ----------------------------------------------------------------------
    // Atributos (Variables que definen el estado de un objeto Alquiler)
    // ----------------------------------------------------------------------
    private String idAlquiler; // Un código único para identificar este contrato.

    // Composición: Un alquiler tiene un Cliente. El objeto Cliente NO se crea aquí,
    // sino que se le "pasa" cuando se crea el Alquiler.
    private Cliente cliente;

    // Composición: De igual manera, un alquiler tiene un Vehículo.
    // (Podría ser un Coche o un SUV, ya que ambos heredan de Vehiculo).
    private Vehiculo vehiculo;

    private int dias; // Cuántos días se alquilará el vehículo.
    private LocalDate fechaInicio; // La fecha en que comienza el alquiler.

    // ----------------------------------------------------------------------
    // Constructor (Método especial para crear nuevos objetos Alquiler)
    // ----------------------------------------------------------------------
    // Este método se llama automáticamente cuando haces 'new Alquiler(...)'.
    public Alquiler(String idAlquiler, Cliente cliente, Vehiculo vehiculo, int dias) {
        // 'this.idAlquiler' se refiere a la variable de arriba (el atributo).
        // '= idAlquiler' se refiere al valor que se pasa entre paréntesis (el parámetro).
        this.idAlquiler = idAlquiler;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.dias = dias;
        // Asignamos la fecha actual como fecha de inicio usando una utilidad de Java.
        this.fechaInicio = LocalDate.now();
    }

    // ----------------------------------------------------------------------
    // Métodos (Acciones que puede realizar un objeto Alquiler)
    // ----------------------------------------------------------------------

    // Este método calcula el costo total del alquiler.
    public double calcularCostoTotal() {
        // Uso de Polimorfismo: La clase Alquiler pide al vehículo que calcule su propia tarifa.
        // Si 'vehiculo' es un Coche, llama a la lógica de tarifa del Coche.
        // Si 'vehiculo' es un SUV, llama a la lógica de tarifa del SUV.
        return vehiculo.calcularTarifaTotal(dias);
    }

    // Este método imprime todos los detalles del contrato de alquiler.
    public void mostrarResumen() {
        System.out.println("\n--- Resumen del Alquiler ---");
        System.out.println("ID Alquiler: " + idAlquiler);
        // Pedimos el nombre al objeto cliente (Encapsulamiento).
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.print("Vehículo: ");
        // Uso de Polimorfismo: Le decimos al vehículo que muestre sus propios detalles.
        vehiculo.mostrarDetalles();
        System.out.println("Días alquilados: " + dias);
        System.out.println("Fecha de inicio: " + fechaInicio);
        // Llamamos al método que acabamos de crear para obtener el costo.
        System.out.printf("Costo Total Estimado: \\$%.2f\n", calcularCostoTotal());
        System.out.println("----------------------------");
    }

    // Getters (Métodos para obtener los valores de los atributos)
    // Este método permite a otras partes del programa saber qué vehículo se alquiló.
    public Vehiculo getVehiculo() { return vehiculo; }
}