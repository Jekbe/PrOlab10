package zad3;

public class BrakBiletow implements Stan {
    private final Automat automat;

    public BrakBiletow(Automat automat) {
        this.automat = automat;
    }

    @Override
    public void wlozPieniadze(double kwota) {
        System.out.println("Brak biletów. Automat wyłączony.");
    }

    @Override
    public void wybierzBilet(String typBiletu) {
        System.out.println("Brak biletów. Automat wyłączony.");
    }

    @Override
    public void wydajBilet() {
        System.out.println("Brak biletów. Automat wyłączony.");
    }
}
