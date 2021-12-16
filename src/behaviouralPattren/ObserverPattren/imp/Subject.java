package behaviouralPattren.ObserverPattren.imp;

import java.util.ArrayList;
import java.util.List;

abstract public class Subject {

    private List<Observer> observers;

    public Subject(){
        this.observers = new ArrayList<>();
    }

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void detach(Observer observer){
        this.observers.remove(observer);
    }

    protected void emitValues(String value){
        this.observers.forEach(observer -> {
            observer.getContent(value);
                });
    }
}
