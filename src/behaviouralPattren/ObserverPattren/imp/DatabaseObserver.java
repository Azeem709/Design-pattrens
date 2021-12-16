package behaviouralPattren.ObserverPattren.imp;

public class DatabaseObserver implements Observer {

    @Override
    public String getContent(String data) {
        System.out.println(data);
        return null;
    }
}
