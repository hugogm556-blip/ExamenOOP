/**
 *
 */
package carrentalsys;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- DEMOSTRACIÓN DEL SISTEMA DE ALQUILER DE VEHÍCULOS ---");

        // Inicializar el Sistema
        SistemaAlquiler sistema = new SistemaAlquiler();

        // 1. Añadir Vehículos (Herencia/Polimorfismo)
        // Miembro A: Añade Coches
        Coche c1 = new Coche("ABC-123", "Toyota", "Yaris", 35.0, 5);
        Coche c2 = new Coche("DEF-456", "Ford", "Fiesta", 40.0, 3);
        sistema.agregarVehiculo(c1);
        sistema.agregarVehiculo(c2);

        // Miembro B: Añade SUVs
        SUV s1 = new SUV("GHI-789", "Jeep", "Wrangler", 70.0, true);
        SUV s2 = new SUV("JKL-012", "Nissan", "Qashqai", 55.0, false);
        sistema.agregarVehiculo(s1);
        sistema.agregarVehiculo(s2);

        // 2. Añadir Clientes
        Cliente cli1 = new Cliente("C001", "Ana Garcia", "555-1234");
        Cliente cli2 = new Cliente("C002", "Beto Lopez", "555-5678");
        sistema.agregarCliente(cli2); // Miembro A/B: Añade clientes

        // 3. Mostrar Inventario (Polimorfismo en acción)
        System.out.println("\n--- INVENTARIO DE VEHÍCULOS ---");
        for (Vehiculo v : sistema.getInventario()) {
            v.mostrarDetalles(); // Llama a mostrarDetalles() específico (Coche o SUV)
        }

        // 4. Crear un Alquiler y Proceso de Pago
        // Miembro A: Crea Alquiler 1
        Alquiler alq1 = sistema.crearAlquiler(cli1, c1, 3);
        if (alq1 != null) {
            alq1.mostrarResumen();

            // Pago (Polimorfismo por Interfaz)
            ServicioPago pago1 = new PagoTarjeta("1111-2222-3333-4444");
            pago1.procesarPago(alq1.calcularCostoTotal());
        }

        // Miembro B: Crea Alquiler 2
        Alquiler alq2 = sistema.crearAlquiler(cli2, s1, 5);
        if (alq2 != null) {
            alq2.mostrarResumen();

            // Pago (Reutilizando la interfaz de pago)
            ServicioPago pago2 = new PagoTarjeta("5555-6666-7777-8888");
            pago2.procesarPago(alq2.calcularCostoTotal());
        }

        // 5. Demostración de Polimorfismo en Tarifas
        System.out.println("\n--- PRUEBA DE TARIFAS POLIMÓRFICAS ---");
        System.out.printf("Tarifa Coche (3 días): \\$%.2f\n", c1.calcularTarifaTotal(3)); // Lógica de Coche
        System.out.printf("Tarifa SUV 4x4 (5 días): \\$%.2f\n", s1.calcularTarifaTotal(5)); // Lógica de SUV
    }
}
