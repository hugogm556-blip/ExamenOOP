/**
 *
 */
// 'package' es como una carpeta que organiza tus clases.
package carrentalsys;

/**
 * @author hugog28 oct 2025
 */
// Esta es la clase COCHE. Fíjate en 'extends Vehiculo'.
// Esto significa que Coche HEREDA todas las características (atributos y métodos)
// que ya están definidos en la clase Vehiculo (como matrícula, marca, etc.).
public class Coche extends Vehiculo {
    // ----------------------------------------------------------------------
    // Atributo específico de Coche
    // ----------------------------------------------------------------------
    // Además de lo que ya tiene (heredado de Vehiculo), un Coche tiene su propio atributo:
    private int numPuertas;

    // ----------------------------------------------------------------------
    // Constructor (Método para crear un nuevo objeto Coche)
    // ----------------------------------------------------------------------
    // Necesitamos todos los datos del Vehiculo, más el número de puertas.
    public Coche(String matricula, String marca, String modelo, double tarifaDiaria, int numPuertas) {
        // 'super' llama al constructor de la clase padre (Vehiculo).
        // Esto inicializa la matrícula, marca, modelo y tarifa, delegando el trabajo a Vehiculo.
        super(matricula, marca, modelo, tarifaDiaria);
        // Luego inicializamos el atributo propio de Coche.
        this.numPuertas = numPuertas;
    }

    // ----------------------------------------------------------------------
    // Métodos (Acciones que puede realizar un objeto Coche)
    // ----------------------------------------------------------------------

    // @Override indica que estamos REESCRIBIENDO un método que ya existía en la clase Vehiculo.
    // Esto es fundamental para el Polimorfismo.
    @Override
    public void mostrarDetalles() {
        // Usamos 'getMatricula()' porque los atributos de Vehiculo son 'private' y
        // debemos acceder a ellos a través de sus métodos 'getter' (Encapsulamiento).
        System.out.println("Coche - Matrícula: " + getMatricula() + ", Modelo: " + getModelo() + ", Puertas: " + numPuertas);
    }

    /**
     * Polimorfismo: La tarifa del coche es simple.
     */
    // También reescribimos este método para definir cómo un COCHE calcula su tarifa.
    @Override
    public double calcularTarifaTotal(int dias) {
        // La variable 'tarifaDiaria' se hereda de la clase Vehiculo.
        // Aquí se aplica una lógica específica de Coche: Tarifa base + 5% extra por alguna razón.
        return (tarifaDiaria * dias) * 1.05;
    }
}