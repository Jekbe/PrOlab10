package zad2;

public class User implements Observer {
    private final String nazwa;

    public User(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void aktualizuj(String symbol, double nowaCena) {
        System.out.println("Użytkownik " + nazwa + " powiadomiony: " + symbol + " nowa cena: " + nowaCena);
    }
}