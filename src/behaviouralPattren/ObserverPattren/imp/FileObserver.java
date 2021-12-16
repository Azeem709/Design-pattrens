package behaviouralPattren.ObserverPattren.imp;

public class FileObserver implements Observer {
    @Override
    public String getContent(String data) {
        System.out.println(data);
        return null;
    }
}
