package org.apache.commons.math3;

import org.junit.Assert;

public class MATHTestJUnit {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testvalue(){
        double[] x = {1,2,3,4,5};
        double[] y = {1,2,3,4,5};
        MATHParser.StepFunction num = new MATHParser.StepFunction(x, y);
        double m = num.value(1);
        Integer n = new Integer(1);
        Assert.assertEquals(1, m, n);
    }
}