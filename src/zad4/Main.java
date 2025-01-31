package zad4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Procesowanie zamówienia cyfrowego:");
        OrderProcessor digitalOrder = new DigitalOrderProcessor();
        digitalOrder.processOrder();

        System.out.println("\nProcesowanie zamówienia fizycznego:");
        OrderProcessor physicalOrder = new PhysicalOrderProcessor();
        physicalOrder.processOrder();
    }
}
