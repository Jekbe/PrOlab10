package zad3;

public class WprowadzaniePieniedzy implements Stan {
    private final Automat automat;

    public WprowadzaniePieniedzy(Automat automat) {
        this.automat = automat;
    }

    @Override
    public void wlozPieniadze(double kwota) {
        automat.dodajSaldo(kwota);
        System.out.println("Dodano " + kwota + " zł. Aktualne saldo: " + automat.getSaldo() + " zł.");
    }

    @Override
    public void wybierzBilet(String typBiletu) {
        double cena = switch (typBiletu) {
            case "20-minutowy" -> 3.00;
            case "60-minutowy" -> 5.00;
            case "calodzienny" -> 10.00;
            default -> 0;
        };

        if (cena == 0) {
            System.out.println("Niepoprawny wybór biletu.");
            return;
        }

        if (automat.getSaldo() >= cena) {
            automat.zmniejszSaldo(cena);
            System.out.println("Wybrano bilet: " + typBiletu + " za " + cena + " zł.");
            automat.ustawStan(new WydawanieBiletu(automat));
        } else {
            System.out.println("Niewystarczające środki na bilet.");
        }
    }

    @Override
    public void wydajBilet() {
        System.out.println("Najpierw wybierz bilet.");
    }
}
