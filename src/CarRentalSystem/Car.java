/**
 * 
 */
package CarRentalSystem;

/**
 * @author hugog27 oct 2025
 */
public class Car {
	    // --- Atributos (Campos Privados: Encapsulación) ---
	    
	    /** Identificador único del vehículo (e.g., "ABC-123"). */
		private String plateNumber;
	    
	    /** Marca del vehículo (e.g., "Toyota", "Ford"). */
		private String make;
	    
	    /** Modelo específico del vehículo (e.g., "Corolla", "Explorer"). */
		private String model;
	    
	    /** Tarifa base por día de alquiler, en la moneda local. */
		private double basePricePerDay;
	    
	    /** Indica si el vehículo está disponible para alquiler (true) o rentado (false). */
		private boolean isAvailable;
		
		/**
		 * Constructor para inicializar un nuevo objeto Car.
		 * Por defecto, un vehículo recién creado está disponible para alquilar (isAvailable = true).
		 * * @param plateNumber El número de matrícula (String).
		 * @param make La marca del vehículo.
		 * @param model El modelo del vehículo.
		 * @param basePricePerDay La tarifa de alquiler por día.
		 */
		
	public Car(String plateNumber, String make, String model, double basePricePerDay) {
		this.plateNumber = plateNumber;
		this.make = make;
		this.model = model;
		this.basePricePerDay = basePricePerDay;
		this.isAvailable = true;
	}
	// --- Getters y Setters (Métodos de Acceso) ---
    // Proporcionan acceso controlado a los atributos privados (Encapsulación).
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getBasePricePerDay() {
		return basePricePerDay;
	}

	public void setBasePricePerDay(double basePricePerDay) {
		this.basePricePerDay = basePricePerDay;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
