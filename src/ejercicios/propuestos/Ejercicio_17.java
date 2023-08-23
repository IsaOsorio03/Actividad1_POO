
package ejercicios.propuestos;

import java.util.Scanner;


public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el Radio: ");
        double radio = entrada.nextFloat();
        double area = Math.PI * Math.pow(radio, 2);
        double circunferencia = Math.PI * radio*2;
        System.out.println("El área del círculo es: " + area);
        System.out.println("El área del círculo es: " + circunferencia);               
    }
    
}
