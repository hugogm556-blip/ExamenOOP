/**
 *
 */
package carrentalsys;

/**
 * @author hugog28 oct 2025
 */
public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String matricula, String marca, String modelo, double tarifaDiaria, int numPuertas) {
        super(matricula, marca, modelo, tarifaDiaria);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Coche - Matrícula: " + getMatricula() + ", Modelo: " + getModelo() + ", Puertas: " + numPuertas);
    }

    /**
     * Polimorfismo: La tarifa del coche es simple.
     */
    @Override
    public double calcularTarifaTotal(int dias) {
        // Tarifa base del Vehiculo + 5% extra por ser coche pequeño
        return (tarifaDiaria * dias) * 1.05;
    }
}
