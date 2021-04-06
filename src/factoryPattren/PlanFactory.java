package factoryPattren;

import factoryPattren.abstractPlan.Plan;
import factoryPattren.concreteImp.CommercialPlan;
import factoryPattren.concreteImp.DomesticPlan;

import java.io.IOException;

/**
 * Factory pattren is creational design pattren
 * The Factory Method Pattern is also known as Virtual Constructor
 Factory Method Pattern
 A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class
 for creating an object but let the subclasses decide which class to instantiate.
 In other words, subclasses are responsible to create the instance of the class.
 */
public class PlanFactory {

    public Plan getPlan(String planName) throws IOException {
        if(planName == null)
            throw new IOException("Plan cannot be nulkl");
        else if(planName.equals( "COMMERCIAL"))
            return new CommercialPlan();
        else  if(planName.equals("DOMESTIC"))
            return new DomesticPlan();
        return null;
    }
}
