package zad3;

public class Automat {
    private Stan stan;
    private double saldo = 0;
    private int liczbaBiletow;

    public Automat(int liczbaBiletow) {
        this.liczbaBiletow = liczbaBiletow;
        this.stan = liczbaBiletow > 0 ? new BrakPieniedzy(this) : new BrakBiletow(this);
    }

    public void ustawStan(Stan nowyStan) {
        this.stan = nowyStan;
    }

    public void dodajSaldo(double kwota) {
        this.saldo += kwota;
    }

    public void zmniejszSaldo(double kwota) {
        this.saldo -= kwota;
    }

    public double getSaldo() {
        return saldo;
    }

    public void zmniejszLiczbeBiletow() {
        liczbaBiletow--;
        if (liczbaBiletow == 0) {
            ustawStan(new BrakBiletow(this));
        }
    }

    public void wlozPieniadze(double kwota) {
        stan.wlozPieniadze(kwota);
    }

    public void wybierzBilet(String typBiletu) {
        stan.wybierzBilet(typBiletu);
    }

    public void wydajBilet() {
        stan.wydajBilet();
    }
}

class Main {
    public static void main(String[] args) {
        Automat automat = new Automat(3);

        automat.wlozPieniadze(5);
        automat.wybierzBilet("60-minutowy");
        automat.wydajBilet();

        automat.wlozPieniadze(2);
        automat.wybierzBilet("20-minutowy");
        automat.wlozPieniadze(1);
        automat.wybierzBilet("20-minutowy");
        automat.wydajBilet();
    }
}
