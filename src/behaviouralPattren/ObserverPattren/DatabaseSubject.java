package behaviouralPattren.ObserverPattren;

import behaviouralPattren.ObserverPattren.imp.Subject;

public class DatabaseSubject extends Subject {



    public void publish(String data){
       emitValues(data);

    }


}
