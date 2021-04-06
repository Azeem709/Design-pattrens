package factoryPattren.abstractPlan;

public abstract class Plan {

    protected double rate;
//    public abstract void getRate();
    public void calculateBill(int units){
        System.out.println("Units = "+units+"\t Rate="+rate);
        System.out.println(units*rate);
    }

}

