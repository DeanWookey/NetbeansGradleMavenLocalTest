package za.co.localrepository;

import za.co.library.Subtractor;
import za.co.snapshotlibrary.Adder;

public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adder adder = new Adder();
        int ans = adder.add(2, 3);
        System.out.println("2 + 3 = " + ans);
        
        Subtractor subtractor = new Subtractor();
        int ans2 = subtractor.subtract(2, 7);
        System.out.println("7 - 2 = " + ans2);
    }
}
