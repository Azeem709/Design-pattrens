package singleton;

public class EmployeeEarlyInit {

    private String name;
    private String contact;

    private EmployeeEarlyInit(){
        name = "azeem";
        contact = "888";
    }

    private static EmployeeEarlyInit instance =new EmployeeEarlyInit();

    public static EmployeeEarlyInit getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return "name = "+name+"\t"+"concat="+contact;
    }
}
