package clases;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa {
        empleados = new ArrayList<Empleado>();
    }

    //metodo que agrega empleados a la empresa
    public void cotratarEmpleado(Empleado e) {
        empleados.add(e);
    }

    //metodo que obtiene el total de empleados
    public int getTotalEmpleados() {
        return empleados.size();
    }

    //metodo que muestra los nombres y salarios de los empleados
    public void nombreSalario() {
        for(Empleado e:empleados) {
            System.out.println("Nombre: " + e.getNombre() +
            "Salario: " + e.getSalario());
        }
    }

    //metodo que retorna el total del dinero pagado a todos los empleados
    public double getTotalSalarios() {
        double total = 0;
        for(Empleado e:empleados) {
            total = total + e.getSalario();
        }
        return total;
    }

    //metodo que muestra el nombre, cargo y salario del empleado que mas salario gana
    public void empleadoMayorSalario() {
        Empleado empMayorSalario = empleados.get(0);
        double menSalario = empleados.get(0).getSalario();
        for(Empleado e:empleados) {
            if(e.getsalario() < menSalario) {
                menSalario = e.getSalario();
                empMenorSalario = e;

            }
        }
        System.out.println("El empleado que menos dinero gana es: ");
        System.out.println("Nombre: " + empMenorSalario.getNombre());
        System.out.println("Cargo:" + empMenorSalario.getCargo());
        System.out.println("Salario:" + empMenorSalario.getSalario());

    }
}
