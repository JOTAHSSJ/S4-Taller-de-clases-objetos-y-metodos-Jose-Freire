package Ejercicio3;

import javax.swing.*;
import java.io.IOException;

public class Kilometraje
{
    public static void main(String args[]) throws IOException
    {
        JOptionPane.showMessageDialog(null,"Sistema de calculo de kilometraje");
        float numMotor= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el mumero de motor"));
        int numVentanas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventanas"));
        int numPuertas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas"));
        String nombreMarca= JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
        String nombreModelo= JOptionPane.showInputDialog("Ingrese el modelo del vehiculo");
        double kmInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje inicial"));
        double kmFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje final"));
        double kmRecorrido= kmFinal-kmInicial;

        JOptionPane.showMessageDialog(null,"\nNumero Motor: "+numMotor +
                "\nNumero Ventanas: "+numVentanas +
                "\nNumero Puertas: "+numPuertas +
                "\nMarca: "+ nombreMarca +
                "\nModelo: "+ nombreModelo+
                "\nKm Iniciales: "+ kmInicial+
                "\nKm Finales: "+kmFinal+
                "\nKm Recorridos: "+ kmRecorrido);

    }
}