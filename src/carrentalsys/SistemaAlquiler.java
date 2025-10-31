/**
 *
 */
package carrentalsys;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase central que gestiona la lógica del sistema. Aplica Agregación de
 * Vehiculos y Clientes.
 */
//Esta clase es el cerebro del sistema. Es la que guarda todos los objetos
//(vehículos, clientes, alquileres) y maneja la lógica central de la aplicación.
public class SistemaAlquiler {
	// ----------------------------------------------------------------------
	// Atributos (Las listas de objetos que gestiona el sistema)
	// ----------------------------------------------------------------------

	// Listas para guardar todos los vehículos y clientes.
	// La 'Agregación' significa que estas listas contienen otros objetos (Vehiculo, Cliente)
	// que existen independientemente del SistemaAlquiler.
	private List<Vehiculo> inventario; // Agregación: Guarda todos los vehículos disponibles.
	private List<Cliente> clientes; // Agregación: Guarda todos los clientes registrados.
	private List<Alquiler> alquileres; // Guarda todos los contratos de alquiler activos.

	// Un contador simple para generar IDs de alquiler únicos, empezando en 1.
	private int nextAlquilerId = 1;

	// ----------------------------------------------------------------------
	// Constructor (Inicializa el sistema cuando se llama 'new SistemaAlquiler()')
	// ----------------------------------------------------------------------
	public SistemaAlquiler() {
		// Inicializamos las listas. 'ArrayList' es una clase de Java que nos permite
		// guardar y gestionar muchos objetos de manera eficiente.
		this.inventario = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.alquileres = new ArrayList<>();
	}

	// ----------------------------------------------------------------------
	// Métodos de gestión (Funciones para agregar o acceder a los datos)
	// ----------------------------------------------------------------------

	// Recibe un objeto 'Vehiculo' y lo añade a la lista 'inventario'.
	public void agregarVehiculo(Vehiculo v) {
		inventario.add(v);
	}

	// Recibe un objeto 'Cliente' y lo añade a la lista 'clientes'.
	public void agregarCliente(Cliente c) {
		clientes.add(c);
	}

	// Devuelve la lista completa de vehículos (el inventario) a quien la pida.
	public List<Vehiculo> getInventario() {
		return inventario;
	}

	/**
	 * Busca un vehículo por matrícula.
	 *
	 * @param matricula Matrícula del vehículo.
	 * @return El Vehiculo encontrado o null.
	 */
	// Este método busca un vehículo en la lista a partir de su matrícula.
	public Vehiculo buscarVehiculo(String matricula) {
		// Usa Stream API (una buena práctica en Java):
		// 1. inventario.stream() convierte la lista en una "corriente" de datos.
		// 2. .filter(...) revisa cada vehículo (v) y solo mantiene aquellos cuya matrícula
		//    coincide con la matrícula buscada (ignorando mayúsculas/minúsculas).
		// 3. .findFirst() toma el primer vehículo que encuentra.
		// 4. .orElse(null) devuelve ese vehículo, o 'null' si no se encontró ninguno.
		return inventario.stream().filter(v -> v.getMatricula().equalsIgnoreCase(matricula)).findFirst().orElse(null);
	}

	// Método para crear una transacción (Alquiler)
	public Alquiler crearAlquiler(Cliente cliente, Vehiculo vehiculo, int dias) {
		// Primero, verificamos que nos hayan pasado objetos válidos.
		if (vehiculo == null || cliente == null) {
			return null; // Si falta cliente o vehículo, no se puede crear y devolvemos 'null'.
		}

		// Crear la composición: Creamos el nuevo contrato de alquiler.
		// Generamos un ID único concatenando "A" con el contador, y luego incrementamos el contador (++).
		Alquiler nuevoAlquiler = new Alquiler("A" + (nextAlquilerId++), cliente, vehiculo, dias);

		// Guardamos el alquiler recién creado en nuestra lista.
		alquileres.add(nuevoAlquiler);

		// Devolvemos el objeto Alquiler para que se pueda procesar el pago.
		return nuevoAlquiler;
	}
}