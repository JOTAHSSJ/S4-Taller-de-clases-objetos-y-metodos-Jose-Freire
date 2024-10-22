package Ejercicio2;

import javax.swing.*;
import java.io.IOException;

public class Calculadora
{

    public static void main(String args[]) throws IOException
    {
        int op;
        double num1, num2,resultado;

        op= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la operacion que deseas realizar " +
                "1. Suma/2.Resta/3.Multiplicacion/4.Division"));

        switch (op)
        {
            case 1:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                resultado= num1+num2;
                JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);

                break;
            case 2:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                resultado= num1-num2;
                JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
                break;
            case 3:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                resultado= num1*num2;
                JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
                break;
            case 4:

                num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                if (num2>0){
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No se puede dividir para 0");
                }
                break;
            default:
                System.out.println("No existe esa opcion");
                break;
        }
    }
}