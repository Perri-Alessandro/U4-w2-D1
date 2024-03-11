package Entities.es_3;

public class ContoOnline extends ContoCorrente {

    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("TITOLARE: " + titolare + " - SALDO: " + saldo + " - NUMERO MOVIMENTI: " + nMovimenti + "MASSIMO MOVIMENTI: " + maxMovimenti + " - MASSIMO PRELIEVO POSSIBILE: " + maxPrelievo);
    }

    @Override
    public void preleva(double x) {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }
    }
}
