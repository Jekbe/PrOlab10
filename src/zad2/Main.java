package zad2;

public class Main {
    public static void main(String[] args) {
        Gielda gielda = new Gielda();
        gielda.dodajAkcje("AAPL", 150.00);
        gielda.dodajAkcje("TSLA", 700.00);

        User jan = new User("Jan");
        User anna = new User("Anna");

        Akcja apple = gielda.pobierzAkcje("AAPL");
        Akcja tesla = gielda.pobierzAkcje("TSLA");

        apple.dodajObserwatora(jan);
        tesla.dodajObserwatora(anna);

        gielda.symulujZmianyCen();
    }
}
