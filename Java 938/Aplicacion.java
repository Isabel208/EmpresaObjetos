// Importaciones necesarias para el funcionamiento del programa
import javax.swing.JOptionPane;  // Para crear ventanas de diálogo
import java.util.ArrayList;      // Para usar ArrayList como estructura de datos

/**
 * Clase principal que gestiona un sistema básico de empleados
 * Permite registrar empleados, sus salarios y cargos, y realizar diferentes análisis
 */
public class Aplicacion {
    public static void main(String[] args) {
        // Declaración de variables
        String nombre, cargo;                     // Almacenan datos temporales de cada empleado
        double salario;                          // Almacena el salario temporal de cada empleado
        double total = 0;                        // Acumulador para la suma total de salarios
        double mayorSalario, menorSalario;       // Almacenan los salarios extremos
        int posicion = 0;                        // Índice para rastrear posiciones en los ArrayList

        // Creación de estructuras de datos para almacenar la información
        // Se usan ArrayList para poder agregar elementos dinámicamente
        ArrayList<String> nombres = new ArrayList<String>();   // Almacena nombres de empleados
        ArrayList<Double> salarios = new ArrayList<Double>();  // Almacena salarios
        ArrayList<String> cargos = new ArrayList<String>();    // Almacena cargos

        // Solicitar al usuario la cantidad de empleados a registrar
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, 
        "Ingrese la cantidad de empleados"));

        // Ciclo principal de ingreso de datos
        // Se ejecuta una vez por cada empleado que se va a registrar
        for (int emp = 0; emp < cantidad; emp++) {
            // Solicitud de datos mediante ventanas de diálogo
            nombre = JOptionPane.showInputDialog(null, 
                "Ingrese el nombre del empleado");
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Ingrese el salario del empleado"));
            cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");

            // Almacenamiento de los datos en los ArrayList correspondientes
            nombres.add(nombre);    // Agrega el nombre al final de la lista
            salarios.add(salario);  // Agrega el salario al final de la lista
            cargos.add(cargo);      // Agrega el cargo al final de la lista
        }

        // SECCIÓN DE REPORTES

        // 1. Reporte de cantidad total de empleados
        System.out.println("El numero total de empleados es: " + cantidad);

        // 2. Reporte detallado de nombres y salarios
        System.out.println("\nLos nombres y salarios de los empleados son:");
        for (int emp = 0; emp < cantidad; emp++) {
            System.out.println("Nombre: " + nombres.get(emp) + 
                " Salario: " + salarios.get(emp));
        }

        // 3. Cálculo y reporte del total de salarios
        // Suma todos los salarios almacenados en el ArrayList
        for (int emp = 0; emp < cantidad; emp++) {
            total = total + salarios.get(emp);
        }
        System.out.println("\nTotal de dinero pagado a todos los empleados: " + total);

        // 4. Búsqueda y reporte del empleado con mayor salario
        System.out.println("\nEl empleado que mas dinero gana es:");
        mayorSalario = salarios.get(0);  // Se inicializa con el primer salario
        // Recorre todos los salarios buscando el mayor
        for (int emp = 1; emp < cantidad; emp++) {
            if (salarios.get(emp) > mayorSalario) {
                mayorSalario = salarios.get(emp);
                posicion = emp;  // Guarda la posición del mayor salario
            }
        }
        // Imprime los datos del empleado con mayor salario
        System.out.println("Nombre: " + nombres.get(posicion) + 
            " Cargo: " + cargos.get(posicion) + 
            " Salario: " + salarios.get(posicion));

        // 5. Búsqueda y reporte del empleado con menor salario
        System.out.println("\nEl empleado que menos dinero gana es:");
        menorSalario = salarios.get(0);  // Se inicializa con el primer salario
        posicion = 0;
        // Recorre todos los salarios buscando el menor
        for (int emp = 1; emp < cantidad; emp++) {
            if (salarios.get(emp) < menorSalario) {
                menorSalario = salarios.get(emp);
                posicion = emp;  // Guarda la posición del menor salario
            }
        }
        // Imprime los datos del empleado con menor salario
        System.out.println("Nombre: " + nombres.get(posicion) + 
            " Cargo: " + cargos.get(posicion) + 
            " Salario: " + salarios.get(posicion));
    }
}