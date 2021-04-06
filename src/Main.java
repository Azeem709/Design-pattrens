import factoryPattren.PlanFactory;
import factoryPattren.abstractPlan.Plan;
import proxyPattren.AbsctractProxy.Internet;
import proxyPattren.implementation.ProxyInternet;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        factory
        PlanFactory planFactory = new PlanFactory();
        Plan plan = planFactory.getPlan("COMMERCIAL");
        plan.calculateBill(10);
    }
}
