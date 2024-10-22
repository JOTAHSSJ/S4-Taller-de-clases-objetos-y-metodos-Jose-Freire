package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class AreaYPerimetro
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Ingrese la opcion que desea (1:Triangulo/2:Cuadrado/3:Rectangulo)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int op = Integer.parseInt(br.readLine());

        switch (op)
        {
            case 1:
                System.out.println("Ingrese el 1er lado del triangulo");
                double ladoT1 = Double.parseDouble(br.readLine());
                System.out.println("Ingrese el 2do lado del triangulo");
                double ladoT2 = Double.parseDouble(br.readLine());
                System.out.println("Ingrese el 3er lado del triangulo");
                double ladoT3 = Double.parseDouble(br.readLine());
                System.out.println("Ingrese la base del triangulo");
                double baseT = Double.parseDouble(br.readLine());
                System.out.println("Ingrese la altura del triangulo");
                double alturaT = Double.parseDouble(br.readLine());

                double perimetroTriangulo = ladoT1+ladoT2+ladoT3;
                double areaTriangulo = (baseT*alturaT)/2;

                System.out.println("El perimetro del triangulo es: " + perimetroTriangulo);
                System.out.println("El area del triangulo es: " + areaTriangulo);
                break;
            case 2:
                System.out.println("Ingrese el lado del cuadrado");
                double ladoC = Double.parseDouble(br.readLine());
                double perimetroCuadrado = ladoC*4;
                double areaCuadrado= ladoC*ladoC;

                System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado);
                System.out.println("El area del cuadrado es: " + areaCuadrado);
                break;
            case 3:
                System.out.println("Ingrese la base del rectangulo");
                double baseR = Double.parseDouble(br.readLine());
                System.out.println("Ingrese la altura del rectangulo");
                double alturaR = Double.parseDouble(br.readLine());
                double perimetroRectangulo = (baseR*2) + (alturaR*2);
                double areaRectangulo = baseR * alturaR;

                System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
                System.out.println("El area del rectangulo es: " + areaRectangulo);

                break;
            default:
                System.out.println("No existe esa opcion");
                break;
        }
    }

}