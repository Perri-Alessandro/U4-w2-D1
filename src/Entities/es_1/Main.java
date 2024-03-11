package Entities.es_1;

import Entities.es_1.exceptions.IndiceNonValidoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        log.info("cio");
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