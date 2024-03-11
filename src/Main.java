import Entities.es_1.Interi;
import Entities.exceptions.IndiceNonValidoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("PRIMO ARRAY, 5 NUMERI INTERI CASUALI:");
        Interi primoArray = new Interi();
        System.out.println(primoArray);

        try {
            primoArray.modificaNumero(sc);
        } catch (IndiceNonValidoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("ARRAY AGGIORNATO:");
        System.out.println(primoArray);


        sc.close();
    }

}