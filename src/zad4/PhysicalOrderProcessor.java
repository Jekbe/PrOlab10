package zad4;

public class PhysicalOrderProcessor extends OrderProcessor {
    @Override
    protected void processPayment() {
        System.out.println("Płatność za zamówienie fizyczne została przetworzona.");
    }
}
