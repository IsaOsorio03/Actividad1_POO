
package ejercicios.propuestos;

import java.util.Scanner;


public class Ejercicio_4 {
    
    public static void main(String[] args) {
        int edjuan;
        Scanner entrada = new Scanner (System.in);
        edjuan = entrada.nextInt();
        int edalberto = (2*edjuan)/3;
        int edana = (4*edjuan)/3;
        int edmama = edjuan+edalberto+edana;
        
        System.out.println("La edad de Juan es: " + edjuan);
        System.out.println("La edad de Alberto es: " + edalberto);
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("La edad de alberto es: " + edmama);
    }   
    
}
