import builderPattren.BankAccount;
import factoryPattren.PlanFactory;
import factoryPattren.abstractPlan.Plan;
import singleton.EmployeeEarlyInit;
import singleton.EmployeeLazy;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        factory
        PlanFactory planFactory = new PlanFactory();
        Plan plan = planFactory.getPlan("COMMERCIAL");
        plan.calculateBill(10);

        //singleton
        EmployeeEarlyInit employeeEarlyInit = EmployeeEarlyInit.getInstance();
        System.out.println(employeeEarlyInit.toString());
        EmployeeLazy employeeLazy = EmployeeLazy.getInstancy();
        System.out.println(employeeLazy.toString());

//        Builder
        BankAccount account = new BankAccount.Builder()
                                .accoutNumber(111)
                                .branch("xyz")
                                .name("ac")
                                .city("kkk")
                .build();
        System.out.println(account.getAccountNumber());

    }
}
