package zad1;

import java.util.ArrayList;
import java.util.List;

public class HistoryManager {
    private final List<Memento> mementos = new ArrayList<>();

    public void addMemento(String document){
        mementos.add(new Memento(document));
    }

    public String undo(){
        return mementos.removeLast().document();
    }
}
