/**
 *
 */
package carrentalsys;

/**
 * @author hugog28 oct 2025
 */
//Esta es la clase SUV. De nuevo, 'extends Vehiculo' significa que HEREDA todas
//las características comunes (matrícula, marca, modelo, tarifaDiaria) de Vehiculo.
public class SUV extends Vehiculo {
 // ----------------------------------------------------------------------
 // Atributo específico de SUV
 // ----------------------------------------------------------------------
 // Un SUV tiene un detalle extra: saber si tiene tracción 4x4 o no (un valor verdadero/falso).
 private boolean tiene4x4;

 // ----------------------------------------------------------------------
 // Constructor (Crea un nuevo objeto SUV)
 // ----------------------------------------------------------------------
 // Necesitamos todos los datos del Vehiculo, más si tiene 4x4.
 public SUV(String matricula, String marca, String modelo, double tarifaDiaria, boolean tiene4x4) {
     // 'super' llama al constructor de la clase padre (Vehiculo) para inicializar
     // las partes que son comunes a todos los vehículos.
     super(matricula, marca, modelo, tarifaDiaria);
     // Luego inicializamos el atributo propio de SUV.
     this.tiene4x4 = tiene4x8;
 }

 // ----------------------------------------------------------------------
 // Métodos (Acciones específicas de un SUV)
 // ----------------------------------------------------------------------

 // @Override: Estamos REESCRIBIENDO el método 'mostrarDetalles' de la clase Vehiculo.
 @Override
 public void mostrarDetalles() {
     // Mostramos los detalles generales (heredados) y el detalle propio (4x4).
     // Usamos un pequeño truco (operador ternario) para mostrar "Sí" o "No" en lugar de true/false.
     System.out.println("SUV - Matrícula: " + getMatricula() + ", Modelo: " + getModelo() + ", 4x4: " + (tiene4x4 ? "Sí" : "No"));
 }

 /**
  * Polimorfismo: La tarifa del SUV incluye un recargo por 4x4.
  */
 // @Override: Reescribimos 'calcularTarifaTotal' para que la lógica de cálculo
 // sea diferente a la de un Coche. ¡Esto es el Polimorfismo!
 @Override
 public double calcularTarifaTotal(int dias) {
     // Empezamos con el costo base. 'tarifaDiaria' es una variable 'protected' heredada.
     double total = tarifaDiaria * dias;

     // Lógica específica del SUV: si tiene 4x4, se añade un recargo.
     if (tiene4x4) {
         total += 50.0 * dias; // Recargo extra por 4x4, por ejemplo, $50 por cada día.
     }
     return total; // Devolvemos el total final.
 }
}