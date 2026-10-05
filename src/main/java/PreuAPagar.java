
import java.util.Scanner;

// Activitat 09 — Preu a pagar amb descompte
// Nota: els decimals s'escriuen amb punt (4.5), no amb coma.
public class PreuAPagar {
    public static void main(String[] args) {
        // TODO: llegeix les unitats (enter), el preu unitari (real) i el
        //       descompte en % (real), i mostra:
        //   El valor a pagar serà: ... euros

        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Unitats: ");
        int unitatsComprades = teclat.nextInt();
       
        System.out.println("Preu unitari: ");
        Double preuUnitari = teclat.nextDouble();
        
        System.out.println("Descompte: ");
        Double descompte = teclat.nextDouble();

        Double preufinal = unitatsComprades * preuUnitari;
        Double preudescompte = preufinal * descompte/100;
        Double preutotal = preufinal - preudescompte;
        
        System.out.println("El valor a pagar serà: " + preutotal + "euros");
    }
}
