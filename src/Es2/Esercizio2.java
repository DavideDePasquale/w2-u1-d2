package Es2;

import java.util.*;

public class Esercizio2 {
    protected static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Quanti numeri vuoi?");
        int numero = sc.nextInt();
        Random generatoreNumeri = new Random();
        List<Integer> numeri = new ArrayList<Integer>();
        List<Integer> indicePari = new ArrayList<>();
        List<Integer> indiceDispari = new ArrayList<>();
        boolean pari;
        for (int i = 0; i < numero; i++) {
            numeri.add(generatoreNumeri.nextInt(0,101));
        }

        System.out.println(numeri);
        Collections.sort(numeri);
        System.out.println("Numeri messi random : " + numeri);
        Collections.reverse(numeri);
        System.out.println("Numeri in posizione inversa : " + numeri);

        for (int i = 0; i < numeri.size(); i++) {
            if(numero % 2 == 0 && i % 2 == 0){
                indicePari.add(numeri.get(i));


        } else if (numero % 2 != 0 && i % 2 != 0) {
                indiceDispari.add(numeri.get(i));
            }
        }

        System.out.println("Numeri in indice pari : " + indicePari);
       System.out.println("Numeri in indice dispari : " + indiceDispari);
    }
}
