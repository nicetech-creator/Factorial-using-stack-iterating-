import java.util.*;

public class FactR {

    // static system stack
    public static Stack<FactRecord> s = new Stack<FactRecord>();

    public static int returnedValue;  // global return method return value

    public static void main(String args[]) {
        int n = 3;
        s.push(new FactRecord(n));

        while(!s.empty()) 
        {  // system loop goes until stack is empty
            ((FactRecord) s.peek()).run();
        }  // end system loop

        // display final return value, if any
        System.out.println("\nFinal Value of " + n + " factorial is: " + returnedValue + "\n");
    }  // main method

}  // FactR class