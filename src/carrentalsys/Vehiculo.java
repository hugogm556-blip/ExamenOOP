/**
 *
 */
package carrentalsys;

/**
 * @author hugog27 oct 2025
 */


//Fíjate en 'public abstract class Vehiculo'. 'abstract' significa que NO podemos
//crear objetos directamente de esta clase (no puedes hacer 'new Vehiculo(...)').
//Solo existe para ser heredada por clases más específicas (como Coche o SUV).
public abstract class Vehiculo {
 // ----------------------------------------------------------------------
 // Atributos (Características comunes a Coche, SUV, Camioneta, etc.)
 // ----------------------------------------------------------------------
 private String matricula; // Solo se puede acceder desde esta clase.
 private String marca;
 private String modelo;

 // 'protected' significa que solo las clases que heredan de Vehiculo (como Coche y SUV)
 // pueden acceder directamente a esta variable. Esto es útil para los cálculos de tarifa.
 protected double tarifaDiaria;

 // ----------------------------------------------------------------------
 // Constructor (Inicializa las partes comunes del vehículo)
 // ----------------------------------------------------------------------
 public Vehiculo(String matricula, String marca, String modelo, double tarifaDiaria) {
     // Inicializamos los atributos con los valores que nos pasan.
     this.matricula = matricula;
     this.marca = marca;
     this.modelo = modelo;
     this.tarifaDiaria = tarifaDiaria;
 }

 // ----------------------------------------------------------------------
 // Getters (Métodos para dar acceso controlado a los atributos privados)
 // ----------------------------------------------------------------------
 public String getMatricula() { return matricula; }
 public double getTarifaDiaria() { return tarifaDiaria; }
 public String getModelo() { return modelo;}

 // ----------------------------------------------------------------------
 // Métodos Abstractos (Fuerza a las clases hijas a implementar una acción)
 // ----------------------------------------------------------------------

 // 'abstract' significa: "Todas las clases hijas (Coche, SUV) DEBEN implementar
 // su propia versión de este método".
 // Esto es Abstracción: Definimos qué debe hacerse, pero no cómo.
 // Esto habilita el Polimorfismo, porque cada subclase lo hará a su manera.
 public abstract void mostrarDetalles();

 // Igual que el anterior, obliga a Coche y SUV a definir cómo se calcula
 // la tarifa total (ya que cada uno podría tener descuentos o recargos diferentes).
 public abstract double calcularTarifaTotal(int dias);
}