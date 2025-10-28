/**
 * 
 */
package CarRentalSystem;

/**
 * @author hugog27 oct 2025
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private String telefono;

    public Cliente(String idCliente, String nombre, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters y Setters...
    public String getNombre() { return nombre; }
    // ... otros getters
}
