
package ejercicios.propuestos;

import java.util.Scanner;


public class Ejercicio_14 {
    
    public static void main(String[] args) {
        short numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println ("Ingrese un numero: ");
        numero = entrada.nextShort();
        //cuadrado = Math.pow(numero, 2);
        System.out.println("Su cuadrado es: " + Math.pow(numero, 2));
        System.out.println("Su cubo es: " + Math.pow(numero, 3));
    }
    
}
