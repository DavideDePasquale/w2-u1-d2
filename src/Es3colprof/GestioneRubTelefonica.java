package Es3colprof;

import java.util.HashMap;
import java.util.Map;

public class GestioneRubTelefonica {
    private static Map<String, String> rubrica = new HashMap<String, String>();

    public static void main(String[] args) {
        //Aggiungo dati ad una mappa
        aggiungi("Mario", "43567658867");
        aggiungi("Giuseppe", "21343256");
        aggiungi("Davide", "232456476");
        // stampo dati ad una mappa
        //stampaRubrica();

        // eliminazione di un elemento dalla mappa
        rimuovi("Davide");
        stampaRubrica();
         // cerca contatto dal numero di telefono
        cercaContatto("21343256");
        cercaContattoDaNome("Giuseppe");



    }
    public static void aggiungi(String nome, String telefono){
        rubrica.put(nome,telefono);
    }
    public static void rimuovi(String nome){
        rubrica.remove(nome);
    }
    public static void cercaContatto(String telefono){
        for (String nome : rubrica.keySet()){
          if (telefono.equals(rubrica.get(nome))){
              System.out.println("Il contatto con il numero " + telefono + " è : " + nome);
              break;
          }
        }
    }
    public static void cercaContattoDaNome(String nome){
        System.out.println("Il contatto con il nome " + nome + " è " + rubrica.get(nome));

    }
    public static void stampaRubrica(){
        for (String key : rubrica.keySet()){
            System.out.println("Nome : " + key + " Telefono : " + rubrica.get(key));
        }
    }
}
