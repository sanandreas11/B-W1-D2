package Esercizio1;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci una stringa: ");
        String testStringa = scanner.nextLine();
        boolean pari = stringaPariDispari(testStringa);
        System.out.println("La stringa \"" + testStringa + "\" ha lunghezza pari? " + pari);


        System.out.print("Inserisci un anno: ");
        int anno = scanner.nextInt();
        boolean bisestile = annoBisestile(anno);
        System.out.println("L'anno " + anno + " è bisestile? " + bisestile);

        scanner.close();
    }

    // Metodo che verifica se la lunghezza della stringa è pari
    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    // Metodo che verifica se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        return (anno % 100 != 0 || anno % 400 == 0) && anno % 4 == 0;
    }
}
