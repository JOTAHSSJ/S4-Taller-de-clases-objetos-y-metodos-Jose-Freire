package Ejercicio5;

import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

public class SalarioEmpleado
{
    public static void main(String args[]) throws IOException
    {
        String cedula= JOptionPane.showInputDialog("Ingrese la cedula");
        String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido=JOptionPane.showInputDialog("Ingrese su apellido");
        String genero=JOptionPane.showInputDialog("Ingrese su genero");
        double salario= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
        LocalDate fNacimiento= LocalDate.parse(JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (aaaa-mm-dd)"));
        LocalDate fIngreso= LocalDate.parse(JOptionPane.showInputDialog("Ingrese su fecha de ingreso (aaaa-mm-dd)"));

        Empleado empleado = new Empleado(cedula, nombre, apellido, genero, salario, fNacimiento, fIngreso);
        empleado.mostrarInformacion();

        int op=Integer.parseInt(JOptionPane.showInputDialog("¿Desea modificar el salario? (1. Si / 2. No"));
        if (op == 1)
        {
            double nuevoSalario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo salario: "));
            empleado.cambiarSalario(nuevoSalario);
            JOptionPane.showMessageDialog(null, "Se ha cambiado el salario");
        }
        empleado.mostrarInformacion();

    }
}
