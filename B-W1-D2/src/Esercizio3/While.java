package Esercizio3;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Inserisci una stringa o :q per uscire: ");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                String risultato = String.join(",", input.split(""));
                System.out.println("Risultato: " + risultato);
            }

        } while (!input.equals(":q"));

        System.out.println("Programma terminato.");
    }
}
