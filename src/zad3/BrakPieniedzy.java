package zad3;

public class BrakPieniedzy implements Stan{
    private final Automat automat;

    public BrakPieniedzy(Automat automat) {
        this.automat = automat;
    }

    @Override
    public void wlozPieniadze(double kwota) {
        automat.dodajSaldo(kwota);
        System.out.println("Dodano " + kwota + " zł. Możesz teraz wybrać bilet.");
        automat.ustawStan(new WprowadzaniePieniedzy(automat));
    }

    @Override
    public void wybierzBilet(String typBiletu) {
        System.out.println("Najpierw włóż pieniądze.");
    }

    @Override
    public void wydajBilet() {
        System.out.println("Nie możesz odebrać biletu bez płatności.");
    }
}
