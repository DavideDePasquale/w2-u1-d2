package esercizi.Es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       Set<String> parole = new HashSet<String>();
       Set<String> paroleRipetute = new HashSet<String>();

        System.out.println("Inserisci un numero che rappresenti il numero di elementi da inserire");
        int numero = sc.nextInt();
        System.out.println("Inserisci allora " + numero + " parole");
        for (int i = 0; i < numero; i++) {
          String parola = sc.next();
          if(!parole.add(parola)) {
              paroleRipetute.add(parola);
          }
        }
        System.out.println("Le parole singole sono : ");
        for (String singole : parole){
            System.out.println(singole);
        }
        System.out.println("Le parole duplicate sono : ");
        for(String p : paroleRipetute){
            System.out.println(p);
        }
    }
}
