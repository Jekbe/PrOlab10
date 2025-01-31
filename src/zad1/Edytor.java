package zad1;

import java.util.Scanner;

public class Edytor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HistoryManager manager = new HistoryManager();
        String document = "";

        boolean go = true;
        while (go){
            switch (scanner.nextInt()){
                case 0 -> go = false;
                case 1 -> {
                    manager.addMemento(document);
                    scanner.nextLine();
                    document += scanner.nextLine();
                }
                case 2 -> System.out.println(document);
                case 3 -> manager.addMemento(document);
                case 4 -> document = manager.undo();
            }
        }
    }
}
