package zad4;

public abstract class OrderProcessor {
    public final void processOrder() {
        addToCart();
        processPayment();
        finalizeOrder();
        if (requiresShipping()) {
            prepareShipment();
            shipOrder();
        } else {
            generateAccessKey();
        }
    }

    protected void addToCart() {
        System.out.println("Produkt dodany do koszyka.");
    }

    protected abstract void processPayment();

    protected void finalizeOrder() {
        System.out.println("Zamówienie zostało sfinalizowane.");
    }

    protected boolean requiresShipping() {
        return true;
    }

    protected void prepareShipment() {
        System.out.println("Przygotowanie paczki do wysyłki.");
    }

    protected void shipOrder() {
        System.out.println("Zamówienie wysłane do klienta.");
    }

    protected void generateAccessKey() {

    }
}
