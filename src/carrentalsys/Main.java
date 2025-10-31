/**
 *
 */
package carrentalsys;

public class Main {
    // Este es el 'punto de inicio' de nuestro programa. Cuando ejecutas el código,
    // la computadora siempre busca esta función llamada 'main'.
    public static void main(String[] args) {
        // Esto simplemente imprime un mensaje en la pantalla para saber que el programa ha comenzado.
        System.out.println("--- DEMOSTRACIÓN DEL SISTEMA DE ALQUILER DE VEHÍCULOS ---");

        // Inicializar el Sistema
        // Creamos un objeto llamado 'sistema'. Este objeto es como el cerebro de la aplicación:
        // es el encargado de guardar los vehículos, clientes y gestionar los alquileres.

        SistemaAlquiler sistema = new SistemaAlquiler();

        // 1. Añadir Vehículos (Herencia/Polimorfismo)
        // La Herencia significa que 'Coche' y 'SUV' toman características de una clase principal (ej: 'Vehiculo').

        // Miembro A: Añade Coches
        // Creamos un nuevo objeto 'Coche' con sus datos (matrícula, marca, modelo, precio/día, número de puertas).
        Coche c1 = new Coche("ABC-123", "Toyota", "Yaris", 35.0, 5);
        Coche c2 = new Coche("DEF-456", "Ford", "Fiesta", 40.0, 3);
        // Usamos el objeto 'sistema' para guardar el coche en su lista interna (inventario).
        sistema.agregarVehiculo(c1);
        sistema.agregarVehiculo(c2);

        // Miembro B: Añade SUVs
        // Creamos un nuevo objeto 'SUV' (matrícula, marca, modelo, precio/día, si es 4x4 o no).
        SUV s1 = new SUV("GHI-789", "Jeep", "Wrangler", 70.0, true);
        SUV s2 = new SUV("JKL-012", "Nissan", "Qashqai", 55.0, false);
        // También agregamos los SUVs. ¡Fíjate! Usamos el mismo método 'agregarVehiculo' que con el 'Coche'.
        // Esto es un ejemplo de Polimorfismo.
        sistema.agregarVehiculo(s1);
        sistema.agregarVehiculo(s2);

        // 2. Añadir Clientes
        // Creamos dos nuevos objetos de la clase 'Cliente' con su ID, nombre y teléfono.
        Cliente cli1 = new Cliente("C001", "Ana Garcia", "555-1234");
        Cliente cli2 = new Cliente("C002", "Beto Lopez", "555-5678");
        // Agregamos un cliente al sistema.
        sistema.agregarCliente(cli2); // Miembro A/B: Añade clientes

        // 3. Mostrar Inventario (Polimorfismo en acción)
        System.out.println("\n--- INVENTARIO DE VEHÍCULOS ---");
        // Recorremos la lista de todos los vehículos que tiene guardados el sistema.
        for (Vehiculo v : sistema.getInventario()) {
            // Aquí está la magia del Polimorfismo:
            // Si 'v' es un 'Coche', llama a la función de 'Coche'.
            // Si 'v' es un 'SUV', llama a la función de 'SUV'.
            // ¡El código no necesita saber de antemano qué tipo es!
            v.mostrarDetalles(); // Llama a mostrarDetalles() específico (Coche o SUV)
        }

        // 4. Crear un Alquiler y Proceso de Pago
        // Miembro A: Crea Alquiler 1
        // Intentamos crear un alquiler: (cliente, vehículo, días).
        Alquiler alq1 = sistema.crearAlquiler(cli1, c1, 3);
        // Verificamos si el alquiler se pudo crear (no es 'nulo').
        if (alq1 != null) {
            alq1.mostrarResumen();

            // Pago (Polimorfismo por Interfaz)
            // Creamos un objeto para procesar el pago. 'ServicioPago' es una Interfaz,
            // que nos obliga a tener la función 'procesarPago', sin importar si es Tarjeta o PayPal.
            ServicioPago pago1 = new PagoTarjeta("1111-2222-3333-4444");
            // Llamamos a la función de pago, pasándole el costo total del alquiler.
            pago1.procesarPago(alq1.calcularCostoTotal());
        }

        // Miembro B: Crea Alquiler 2
        // Intentamos crear otro alquiler.
        Alquiler alq2 = sistema.crearAlquiler(cli2, s1, 5);
        if (alq2 != null) {
            alq2.mostrarResumen();

            // Pago (Reutilizando la interfaz de pago)
            // Hacemos lo mismo: creamos otro objeto de pago.
            ServicioPago pago2 = new PagoTarjeta("5555-6666-7777-8888");
            pago2.procesarPago(alq2.calcularCostoTotal());
        }

        // 5. Demostración de Polimorfismo en Tarifas
        System.out.println("\n--- PRUEBA DE TARIFAS POLIMÓRFICAS ---");
        // Fíjate: Ambos llaman a 'calcularTarifaTotal', pero si sus clases ('Coche' y 'SUV')
        // tienen lógicas de cálculo diferentes, el resultado será distinto y correcto para cada uno.
        System.out.printf("Tarifa Coche (3 días): \\$%.2f\n", c1.calcularTarifaTotal(3)); // Lógica de Coche
        System.out.printf("Tarifa SUV 4x4 (5 días): \\$%.2f\n", s1.calcularTarifaTotal(5)); // Lógica de SUV
    }
}