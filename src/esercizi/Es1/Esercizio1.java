package esercizi.Es1;

import java.util.*;

public class Esercizio1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       Set<String> parole = new HashSet<String>();
       List<String> paroleRipetute = new ArrayList<String>();

        System.out.println("Inserisci un numero che rappresenti il numero di elementi da inserire");
        int numero = Integer.parseInt(sc.next());
        System.out.println("Inserisci allora " + numero + " parole");
        for (int i = 0; i < numero; i++) {
          String parola = sc.next();
          if(!parole.add(parola)) {
              paroleRipetute.add(parola);
          }
        }
        System.out.println("Le parole singole sono : ");
        stampaparole(parole);

        System.out.println("Le parole duplicate sono : ");

        stampaparole(paroleRipetute);

    }
    public static void stampaparole(Collection<String> lista){
        for (String p : lista){
            System.out.println(p);
        }
    }
}
