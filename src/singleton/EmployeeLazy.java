package singleton;

public class EmployeeLazy {

    private String name;
    private String contact;

    private static EmployeeLazy instance;
       private EmployeeLazy(){
        name = "azeem";
        contact = "888";
    }

    public static EmployeeLazy getInstancy(){
        if(instance == null){
        synchronized (EmployeeLazy.class){
            if(instance == null)
                instance = new EmployeeLazy();
        }
    }
            return instance;
}
    @Override
    public String toString() {
        return "name = "+name+"\t"+"concat="+contact;
    }
}
