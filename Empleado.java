package Ejercicio5;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Empleado
{
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    private LocalDate fNacimiento;
    private LocalDate fIngreso;


    public Empleado(String cedula, String nombre, String apellido,
                    String genero, double salario, LocalDate fNacimiento, LocalDate fIngreso)
    {
        this.cedula= cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fNacimiento = fNacimiento;
        this.fIngreso = fIngreso;
    }

    public int calcularEdad()
    {
        LocalDate hoy= LocalDate.now();
        return Period.between(this.fNacimiento, hoy).getYears();
    }
    public int calcularAntiguedad()
    {
        LocalDate hoy= LocalDate.now();
        return Period.between(this.fIngreso, hoy).getYears();
    }
    public void cambiarSalario(double nuevoSalario)
    {
        this.salario=nuevoSalario;
    }
    public double calcularPrestaciones()
    {
        int antiguedad = calcularAntiguedad();
        return (antiguedad * this.salario)/12;
    }

    public void mostrarInformacion()
    {
        JOptionPane.showMessageDialog(null,
                "Nombre: "+nombre +
                        "\nApellido: "+apellido+
                        "\nCedula: "+cedula+
                        "\nSalario: "+ salario+
                        "\nEdad: "+calcularEdad()+
                        "\nAntiguedad: "+calcularAntiguedad()+
                        "\nPrestaciones: "+calcularPrestaciones());
    }

}
