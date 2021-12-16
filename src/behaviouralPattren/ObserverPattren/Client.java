package behaviouralPattren.ObserverPattren;

import behaviouralPattren.ObserverPattren.imp.DatabaseObserver;
import behaviouralPattren.ObserverPattren.imp.FileObserver;
import behaviouralPattren.ObserverPattren.imp.Observer;

public class Client {
    public static void main(String ar[]){


        DatabaseSubject subject = new DatabaseSubject();

        Observer FileObserver = new FileObserver();
        Observer DataBaseObserver = new DatabaseObserver();

        subject.attach(FileObserver);
        subject.attach(DataBaseObserver);


        subject.publish("Hello");

    }
}
