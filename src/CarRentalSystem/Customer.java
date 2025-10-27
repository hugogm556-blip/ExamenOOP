/**
 * 
 */
package CarRentalSystem;

/**
 * @author hugog27 oct 2025
 */
public class Customer {
	 // Atributos
	private String nombre;
	private String dni;
	private String correo;
	private String telefono;
	private String calle;


	//Constructor
public Customer(String nombre, String dni, String correo, String telefono, String calle) {
    this.nombre = nombre;
    this.dni = dni;
    this.correo = correo;
    this.telefono = telefono;
    this.calle = calle;
}

	// Getters (para obtener los datos)
public String getNombre() {
    return nombre;
}

public String getDni() {
    return dni;
}

public String getCorreo() {
    return correo;
}

public String getTelefono() {
    return telefono;
}

public String getCalle() {
    return calle;
}

	// Setters (para modificar los datos)
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setDni(String dni) {
    this.dni = dni;
}

public void setCorreo(String correo) {
    this.correo = correo;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public void setCalle(String calle) {
    this.calle = calle;
}
}