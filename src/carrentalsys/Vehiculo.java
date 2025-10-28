/**
 *
 */
package carrentalsys;

/**
 * @author hugog27 oct 2025
 */


public abstract  class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    protected double tarifaDiaria; // protected para acceso en subclases

    public Vehiculo(String matricula, String marca, String modelo, double tarifaDiaria) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaDiaria = tarifaDiaria;
    }

    // Getters
    public String getMatricula() { return matricula; }
    public double getTarifaDiaria() { return tarifaDiaria; }
    public String getModelo() { return modelo;}

    // Método abstracto (Abstracción/Polimorfismo)
    public abstract void mostrarDetalles();

    // Método abstracto para polimorfismo en el cálculo
    public abstract double calcularTarifaTotal(int dias);
}