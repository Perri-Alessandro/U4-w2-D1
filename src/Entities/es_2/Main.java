package Entities.es_2;

import Entities.es_2.exceptions.DivisionePerZeroException;

import java.util.Scanner;

public class Main {

//    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {

//        log.warning("ciaoo");
        Scanner sc = new Scanner(System.in);


        System.out.println("INSERISCI I CHILOMETRI PERCORSI:");
        double km = sc.nextDouble();

        System.out.println("INSERISCI IL CARBURANTE USATO IN LITRI:");
        double carburante = sc.nextDouble();


        try {
            double kmPerLitro = Auto.kmPerLitro(km, carburante);
            System.out.println("HAI PERCORSO " + kmPerLitro + " CHILMETRI PER OGNI LITRO DI CARBURANTE");
        } catch (DivisionePerZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
        
    }

}