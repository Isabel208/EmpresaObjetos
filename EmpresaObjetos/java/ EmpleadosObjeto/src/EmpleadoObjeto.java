import javax.swing.JOptionPane;
import java.util.ArrayList;

public class EmpleadoObjeto {
    public static void main(String[] args) {
        String nombre, cargo;
        double salario, total = 0, mayorSalario, menorSalario;
        int posicion = 0;

        // Definición de las estructuras de almacenamiento
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();
        ArrayList<String> cargos = new ArrayList<>();

        // Ingresar la cantidad de empleados
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados"));
        
        for (int emp = 0; emp < cantidad; emp++) {
            // Lectura de los datos de cada empleado
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));
            cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");

            // Almacenamiento de los datos
            nombres.add(nombre);
            salarios.add(salario);
            cargos.add(cargo);
        }

        // Número total de empleados
        System.out.println("El numero total de empleados es: " + cantidad);

        // Nombre y salario de cada empleado
        System.out.println("Los nombres y salarios de los empleados son:");
        for (int emp = 0; emp < cantidad; emp++) {
            System.out.println("Nombre: " + nombres.get(emp) + " Salario: " + salarios.get(emp));
        }

        // Total de dinero pagado por los salarios de todos los empleados
        for (int emp = 0; emp < cantidad; emp++) {
            total = total + salarios.get(emp);
        }
        System.out.println("Total de dinero pagado a todos los empleados: " + total);

        // Nombre, cargo y salario del empleado que más dinero gana
        System.out.println("El empleado que más dinero gana es:");
        mayorSalario = salarios.get(0);
        for (int emp = 1; emp < cantidad; emp++) {
            if (salarios.get(emp) > mayorSalario) {
                mayorSalario = salarios.get(emp);
                posicion = emp;
            }
        }
        System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) + " Salario: " + salarios.get(posicion));

        // Nombre, cargo y salario del empleado que menos dinero gana
        System.out.println("El empleado que menos dinero gana es:");
        menorSalario = salarios.get(0);
        posicion = 0;
        for (int emp = 1; emp < cantidad; emp++) {
            if (salarios.get(emp) < menorSalario) {
                menorSalario = salarios.get(emp);
                posicion = emp;
            }
        }
        System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) + " Salario: " + salarios.get(posicion));
    }
}

// Clase Empleado
class Empleado {
    private String nombre;
    private double salario;
    private String cargo;

    // Constructor
    public Empleado(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
}

// Clase Empresa
class Empresa {

    private ArrayList<Empleado> empleados;

    // Constructor
    public Empresa() {
        empleados = new ArrayList<>();
    }

    // Método que agrega empleados a la empresa
    public void contratarEmpleado(Empleado e) {
        empleados.add(e);
    }

    // Método que obtiene el total de empleados
    public int getTotalEmpleados() {
        return empleados.size();
    }

    // Método que muestra el nombre y salario de todos los empleados
    public void nombreSalario() {
        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
        }
    }

    // Método que retorna el total de dinero pagado a todos los empleados
    public double getTotalSalarios() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.getSalario();
        }
        return total;
    }

    // Método que muestra el nombre, cargo y salario del empleado que más dinero gana
    public void empleadoMayorSalario() {
        Empleado empMayorSalario = empleados.get(0);
        double maxSalario = empleados.get(0).getSalario();

        for (Empleado e : empleados) {
            if (e.getSalario() > maxSalario) {
                maxSalario = e.getSalario();
                empMayorSalario = e;
            }
        }
        System.out.println("El empleado que más dinero gana es:");
        System.out.println("Nombre: " + empMayorSalario.getNombre() + " Cargo: " + empMayorSalario.getCargo() + " Salario: " + empMayorSalario.getSalario());
    }

    // Método que muestra el nombre, cargo y salario del empleado que menos dinero gana
    public void empleadoMenorSalario() {
        Empleado empMenorSalario = empleados.get(0);
        double menSalario = empleados.get(0).getSalario();

        for (Empleado e : empleados) {
            if (e.getSalario() < menSalario) {
                menSalario = e.getSalario();
                empMenorSalario = e;
            }
        }
        System.out.println("El empleado que menos dinero gana es:");
        System.out.println("Nombre: " + empMenorSalario.getNombre() + " Cargo: " + empMenorSalario.getCargo() + " Salario: " + empMenorSalario.getSalario());
    }
}


