package Entities.es_2;

import Entities.es_2.exceptions.DivisionePerZeroException;

public class Auto {
//    protected double kmPercorsi;
//
//    protected double carburanteUsato;
//
////    public Auto() {
////        this.kmPercorsi = kmPercorsi;
////        this.carburanteUsato = carburanteUsato;
////    }

    public static double kmPerLitro(double kmPercorsi, double carburanteUsato) throws DivisionePerZeroException {
        if (carburanteUsato == 0) {
            throw new DivisionePerZeroException("ERRORE. IL CARBURANTE USATO NON PUò ESSERE ZERO");
        }
        return kmPercorsi / carburanteUsato;
    }
}
