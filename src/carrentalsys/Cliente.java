/**
 *
 */
package carrentalsys;

/**
 * @author hugog27 oct 2025
 */
public class Cliente {
    // ----------------------------------------------------------------------
    // Atributos (Variables que definen el estado de un objeto Cliente)
    // ----------------------------------------------------------------------
    // Fíjate que son 'private'. Esto es ENCAPSULAMIENTO:
    // solo la clase Cliente puede cambiar directamente estos datos.
    private String idCliente; // Identificador único del cliente.
    private String nombre;    // Nombre completo del cliente.
    private String telefono;  // Número de contacto.

    // ----------------------------------------------------------------------
    // Constructor (Método para crear un nuevo objeto Cliente)
    // ----------------------------------------------------------------------
    // Este método se usa para inicializar un nuevo cliente con sus datos.
    public Cliente(String idCliente, String nombre, String telefono) {
        // Asignamos los valores que nos pasan (parámetros) a las variables
        // internas (atributos) del objeto que estamos creando.
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // ----------------------------------------------------------------------
    // Getters (Métodos para OBTENER los valores de los atributos)
    // ----------------------------------------------------------------------

    // Este es un 'Getter'. Es la forma "segura" de permitir que otras partes del
    // programa LEAN el nombre del cliente, sin permitirles cambiarlo directamente.
    public String getNombre() { return nombre; }

    // ... otros getters (getters para idCliente y telefono estarían aquí)
    // ... y Setters (métodos para MODIFICAR los valores)
}
