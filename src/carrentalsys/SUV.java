/**
 *
 */
package carrentalsys;

/**
 * @author hugog28 oct 2025
 */
public class SUV extends Vehiculo {
    private boolean tiene4x4;

    public SUV(String matricula, String marca, String modelo, double tarifaDiaria, boolean tiene4x4) {
        super(matricula, marca, modelo, tarifaDiaria);
        this.tiene4x4 = tiene4x4;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("SUV - Matrícula: " + getMatricula() + ", Modelo: " + getModelo() + ", 4x4: " + (tiene4x4 ? "Sí" : "No"));
    }

    /**
     * Polimorfismo: La tarifa del SUV incluye un recargo por 4x4.
     */
    @Override
    public double calcularTarifaTotal(int dias) {
        double total = tarifaDiaria * dias;
        if (tiene4x4) {
            total += 50.0 * dias; // Recargo extra por 4x4
        }
        return total;
    }
}
