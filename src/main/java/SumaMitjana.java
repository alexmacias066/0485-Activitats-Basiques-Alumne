// Activitat 08 — Suma i mitjana de 4 enters

import java.util.Scanner;

public class SumaMitjana {
    public static void main(String[] args) 
    {
        // TODO: llegeix 4 enters i mostra:
        //   Suma = ...
        //   Mitjana = ...      (recorda que la mitjana pot tenir decimals)

        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introdueix 4 enters: ");
        
        int numero1 = teclat.nextInt();
        int numero2 = teclat.nextInt();
        int numero3 = teclat.nextInt();
        int numero4 = teclat.nextInt();
        
        int suma = numero1 + numero2 + numero3 + numero4;
        
        System.out.println("Suma = " + suma);
        
        int mitjana = suma/4;  
        
        System.out.println("Mitjana = " + mitjana);
    } 
} 
