import builderPattren.BankAccount;
import factoryPattren.PlanFactory;
import factoryPattren.abstractPlan.Plan;
import singleton.EmployeeEarlyInit;
import singleton.EmployeeLazy;

import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

public class Main {



    //     [{(
//
//     )}]
    static boolean isBalancedBarackets(String inputStr) {

        Stack<Character> stack = new Stack<>();

        //(({})[]{()})
        for (int i = 0; i < inputStr.length() ; i++) {

            if (inputStr.charAt(i) == '(' || inputStr.charAt(i) == '{' || inputStr.charAt(i) == '[')
                stack.push(inputStr.charAt(i));
            else {
                if (stack.peek() == '(' && inputStr.charAt(i) == ')')
                    stack.pop();
                else if (stack.peek() == '[' && inputStr.charAt(i) == ']')
                    stack.pop();
                else if (stack.peek() == '{' && inputStr.charAt(i) == '}')
                    stack.pop();

            }


        }

    boolean balanaced = stack.isEmpty();
       return balanaced;


    }

    public static void main(String[] args) throws IOException {

//(({})[]{()})
//        ({)}
        System.out.println("Balanced = " + isBalancedBarackets("({}))))"));
    }
}
