package Es3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Esercizio3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, String> rubrica = new HashMap<String, String>();
        System.out.println("Vuoi aggiungere un contatto in rubrica?");
        String response = sc.nextLine();
        if(response.equals("si")) {
            System.out.println("Quanti contatti vuoi aggiungere?");
            int aggNum = sc.nextInt();
            for (int i = 0; i < aggNum; i++) {


                System.out.println("Inserisci un nuovo contatto in rubrica");
                System.out.println("Inserisci il Nome del contatto : ");
                String nome = sc.next();

                System.out.println("Inserisci il numero di cellulare : ");
                String numeroCell = sc.next();
                rubrica.put(nome, numeroCell);
            }
            System.out.println(rubrica);

            System.out.println("Vuoi eliminare il contatto?");
            String resp = sc.next();
            if (resp.equals("si")) {
                System.out.println("Quale contatto vuoi eliminare?");
                String contattoDaCancellare = sc.next();
                for (int i = 0; i < rubrica.size(); i++) {
                    String contattodaEliminare = rubrica.remove(contattoDaCancellare);

                }
                System.out.println("Bravo! Contatto eliminato");

            }  else if (resp.equals("no")){
                System.out.println("Vuoi cercare un contatto già esistente? si/no");
                String res = sc.next();
                if(res.equals("si")){
                    System.out.println("Qual è il nome che vuoi cercare?");
                    String nomePers = sc.next();
                    for (int i = 0; i < rubrica.size(); i++) {
                       if(nomePers.equals(rubrica.get(nomePers))){
                           System.out.println("Ecco il numero che cercavi! " + rubrica.get(nomePers));
                       } else {
                           System.out.println("Numero non trovato! Non corrisponde a nessun contatto");
                       }

                    }

                }
            }
            System.out.println(rubrica);
        } else {
            System.out.println("Allora che cazz hai avviato a fare il terminale?");
        }

    }
}
