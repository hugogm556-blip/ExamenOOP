/**
 * 
 */
package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase central que gestiona la lógica del sistema. Aplica Agregación de
 * Vehiculos y Clientes.
 */
public class SistemaAlquiler {
	private List<Vehiculo> inventario; // Agregación
	private List<Cliente> clientes; // Agregación
	private List<Alquiler> alquileres;
	private int nextAlquilerId = 1;

	public SistemaAlquiler() {
		this.inventario = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.alquileres = new ArrayList<>();
	}

	// Métodos de gestión de inventario y clientes...
	public void agregarVehiculo(Vehiculo v) {
		inventario.add(v);
	}

	public void agregarCliente(Cliente c) {
		clientes.add(c);
	}

	public List<Vehiculo> getInventario() {
		return inventario;
	}

	/**
	 * Busca un vehículo por matrícula.
	 * 
	 * @param matricula Matrícula del vehículo.
	 * @return El Vehiculo encontrado o null.
	 */
	public Vehiculo buscarVehiculo(String matricula) {
		// Usa Stream API (una buena práctica en Java)
		return inventario.stream().filter(v -> v.getMatricula().equalsIgnoreCase(matricula)).findFirst().orElse(null);
	}

	// Método para crear una transacción
	public Alquiler crearAlquiler(Cliente cliente, Vehiculo vehiculo, int dias) {
		if (vehiculo == null || cliente == null)
			return null;

		// Crear la composición
		Alquiler nuevoAlquiler = new Alquiler("A" + (nextAlquilerId++), cliente, vehiculo, dias);
		alquileres.add(nuevoAlquiler);
		return nuevoAlquiler;
	}
}