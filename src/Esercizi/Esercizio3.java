package Esercizi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Map<String, Integer> rubrica = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean trigger = true;
        while (trigger) {
            System.out.println("1.Aggiungi Contatto\n2.Ricerca tramite Nome\n3.Cancella Contatto\n4.Lista Contatti\n0.Quit");
            int scelta = Integer.parseInt(sc.nextLine());
            switch (scelta) {
                case 0:
                    trigger = false;
                    break;

                case 1:
                    System.out.println("Nome:");
                    String nome = sc.nextLine();
                    System.out.println("Numero:");
                    int numero = Integer.parseInt(sc.nextLine());
                    rubrica.put(nome, numero);
                    System.out.println("Contatto aggiunto!");
                    break;
                case 2:
                    System.out.println("Inserisci Nome del contatto");
                    String search = sc.nextLine();
                    System.out.println("Contatto: " + rubrica.get(search));

                    break;
                case 3:
                    System.out.println("Inserisci Nome del contatto da cancellare");
                    String delete = sc.nextLine();
                    rubrica.remove(delete);
                    System.out.println("Eliminato!");
                    break;
                case 4:
                    System.out.println("Lista contatti:\n" + rubrica);
                    break;
            }
        }

    }
}
