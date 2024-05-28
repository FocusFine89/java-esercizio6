package Esercizi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {

        Set<String> parole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Quanti elementi vuoi inserire (0 per uscire):");
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) {
                break;
            }
            for (int i = 0; i < n; i++) {
                System.out.println("Inserisci una parola:");
                String str = sc.nextLine();
                if (parole.contains(str)) {
                    paroleDuplicate.add(str);
                } else {
                    parole.add(str);
                }

            }
            System.out.println("Parole Duplicate: " + paroleDuplicate);
            System.out.println("Numero Parole Distinte: " + parole.size());
            System.out.println("Le parole Distinte sono: " + parole);
        }
    }
}
