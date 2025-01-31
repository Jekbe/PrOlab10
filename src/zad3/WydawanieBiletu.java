package zad3;

public class WydawanieBiletu implements Stan {
    private final Automat automat;

    public WydawanieBiletu(Automat automat) {
        this.automat = automat;
    }

    @Override
    public void wlozPieniadze(double kwota) {
        System.out.println("Poczekaj, trwa wydawanie biletu.");
    }

    @Override
    public void wybierzBilet(String typBiletu) {
        System.out.println("Poczekaj, trwa wydawanie biletu.");
    }

    @Override
    public void wydajBilet() {
        System.out.println("Wydano bilet. Dziękujemy!");
        automat.zmniejszLiczbeBiletow();
        automat.ustawStan(new BrakPieniedzy(automat));
    }
}
