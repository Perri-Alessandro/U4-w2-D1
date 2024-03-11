package Entities.es_3;

public class ContoCorrente {
    final int maxMovimenti = 50;
    protected String titolare;
    protected double saldo;
    protected int nMovimenti;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) {
        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;
        } else {
            saldo = saldo - x - 0.50;
        }
        nMovimenti++;
    }

    public double retituisciSaldo() {
        return saldo;
    }
}
