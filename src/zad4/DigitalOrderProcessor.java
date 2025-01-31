package zad4;

public class DigitalOrderProcessor extends OrderProcessor{
    @Override
    protected void processPayment() {
        System.out.println("Płatność za zamówienie cyfrowe została przetworzona.");
    }

    @Override
    protected boolean requiresShipping() {
        return false;
    }

    @Override
    protected void generateAccessKey() {
        System.out.println("Generowanie klucza dostępu do produktu cyfrowego.");
    }
}
