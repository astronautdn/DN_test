package org.apache.commons.math3;

public class MATHTest1 {
    public static void main(String[] args){
        MATHTest1 myTest = new MATHTest1();
        myTest.test();
    }
    public void test() {
        double[] x = {1,2,3,4,5};
        double[] y = {1,2,3,4,5};
        MATHParser.StepFunction num = new MATHParser.StepFunction(x, y);
        if(num.value(1) == 1) {
            System.out.println("result is OK!");
        }
        else {
            System.out.println("ERROR!");
        }
    }
}
