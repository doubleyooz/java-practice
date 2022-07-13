package test;

import java.util.Arrays;
import java.util.ArrayList;

public class Test {

    public static void main(String[] foo) {
        ArrayList<Boolean> tests;
        boolean result = true;
        tests = TestStack.testStackInstance();
        //tests = TestQueue.testQueueInstance();

        for (int i = 0; i < tests.size(); i++) {
            if (!tests.get(i))
                result = tests.get(i);

        }

        System.out.println(result ? "THE TESTS HAVE PASSED!" : "THE TESTS FAILED!");

    }
}
