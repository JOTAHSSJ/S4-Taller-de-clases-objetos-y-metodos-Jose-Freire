package Ejercicio4;

import javax.swing.*;
import java.io.IOException;

public class ProductoIVA
{
    public static void main(String args[]) throws IOException
    {
        JOptionPane.showMessageDialog(null,"Sistema de verificación de IVA");
        int op= Integer.parseInt(JOptionPane.showInputDialog("¿El producto tiene IVA? (1.Si / 2.No)"));
        switch (op)
        {
            case 1:
                double valorProducto= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del producto"));
                if(valorProducto<=500)
                {
                    double valorProductoConIva=(valorProducto*0.12)+valorProducto;
                    JOptionPane.showMessageDialog(null,"El producto tiene 12% de IVA"+
                            "\nEl valor total del producto es de: "+valorProductoConIva);
                }
                else if (valorProducto>500 && valorProducto<=1500)
                {
                    double valorProductoConIva=(valorProducto*0.14)+valorProducto;
                    JOptionPane.showMessageDialog(null,"El producto tiene 14% de IVA"+
                            "\nEl valor total del producto es de: "+valorProductoConIva);
                }
                else
                {
                    double valorProductoConIva=(valorProducto*0.15)+valorProducto;
                    JOptionPane.showMessageDialog(null,"El producto tiene 15% de IVA"+
                            "\nEl valor total del producto es de: "+valorProductoConIva);
                }


                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El producto tiene 0% de valor de IVA incrementado");
                break;
            default:
                System.out.println("No existe esa opcion");
                break;
        }
    }
}