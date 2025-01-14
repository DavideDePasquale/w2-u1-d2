package Es2;

import java.util.*;

public class Esercizio2 {

    public static void main(String[] args) {

        System.out.println("Lista numeri sono : ");
       List<Integer> listanumeriRandom = randomNumber(10);
       stampaLista(listanumeriRandom);
        System.out.println("Lista numeri al contrario : ");
       List<Integer> listaCompleta = listaInversa(listanumeriRandom);
       stampaLista(listaCompleta);

        System.out.println("Lista numeri indice pari : ");
       stampaPariDispari(listanumeriRandom,true);

        System.out.println("Lista numeri indice dispari : ");
        stampaPariDispari(listanumeriRandom,false);



    }
    public static List<Integer> randomNumber(int num){
        List<Integer> lista = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            lista.add(rand.nextInt(0,101));

        }
        Collections.sort(lista);
        return lista;
    }
    public static List<Integer> listaInversa(List<Integer> lista){
        List<Integer> listaCompleta = new ArrayList<Integer>(lista);
        for (int i = lista.size() -1 ; i >= 0 ; i--) {
            listaCompleta.add(lista.get(i));
        }
        return listaCompleta;
    }
    public static void stampaLista(List<Integer> lista){
        for (Integer i : lista){
            System.out.println(i);
        }
    }
    public static void stampaPariDispari(List<Integer> lista , boolean b){
        for (int i = 0; i < lista.size(); i++) {
            if(b){
            if(i % 2 == 0){
                System.out.println("Posizione [" + i + "] Valore : " + lista.get(i));
            }
            } else {
                if( i % 2 != 0){
                    System.out.println("Posizione [" + i + "] Valore : " + lista.get(i));
                }
            }


        }
    }
}
