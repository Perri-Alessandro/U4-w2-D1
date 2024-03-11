package Entities.es_1;

import Entities.es_1.exceptions.IndiceNonValidoException;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Interi {
    private int[] numeri;

    public Interi() {
        this.numeri = new int[5];
        Random rand = new Random();
        for (int i = 0; i < this.numeri.length; i++) {
            this.numeri[i] = rand.nextInt(0, 11);
        }
    }

//    public void stampaArrey() {
//        for (int numero : this.numeri) {
//            System.out.println(numero);
//        }
//    }

    public void modificaNumero(Scanner sc) throws IndiceNonValidoException {

        do {
            System.out.println("INSERISCI L'INDICE DEL NUMERO DA MODIFICARE (da 1 a 5) O ZERO PER TERMINARE:");
            int indice = sc.nextInt() - 1; //Parto da 1
            if (indice == -1) {
                break; // Esci a zero
            }
            if (indice < 0 || indice >= numeri.length) {
                throw new IndiceNonValidoException("INDICE NON VALIDO. ESEGUI NUOVAMENTE IL PROGRAMMA");
            }
            System.out.println("INSERISCI UN NUOVO VALORE (tra 0 e 10):");
            int nuovoValore = sc.nextInt();

            numeri[indice] = nuovoValore;

        } while (true);
    }

    @Override
    public String toString() {
        return "Interi{" +
                "numeri=" + Arrays.toString(numeri) +
                '}';
    }
}
