package zad2;

import java.util.*;

public class Akcja {
    private final String symbol;
    private double cena;
    private final List<Observer> obserwatorzy = new ArrayList<>();

    public Akcja(String symbol, double cena) {
        this.symbol = symbol;
        this.cena = cena;
    }

    public void dodajObserwatora(Observer o) {
        obserwatorzy.add(o);
    }

    public void usunObserwatora(Observer o) {
        obserwatorzy.remove(o);
    }

    public double ustawCene(double nowaCena) {
        if (this.cena != nowaCena) {
            this.cena = nowaCena;
            powiadomObserwatorow();
        }
        return nowaCena;
    }

    private void powiadomObserwatorow() {
        for (Observer o : obserwatorzy) {
            o.aktualizuj(symbol, cena);
        }
    }

    public String getSymbol() {
        return symbol;
    }
}

class Gielda {
    private final Map<String, Akcja> akcje = new HashMap<>();
    private final Random random = new Random();

    public void dodajAkcje(String symbol, double cena) {
        akcje.put(symbol, new Akcja(symbol, cena));
    }

    public Akcja pobierzAkcje(String symbol) {
        return akcje.get(symbol);
    }

    public void symulujZmianyCen() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                for (Akcja akcja : akcje.values()) {
                    double nowaCena = akcja.ustawCene(akcja.getSymbol().hashCode() % 100 + random.nextDouble() * 10);
                }
            }
        }, 0, 3000);
    }
}