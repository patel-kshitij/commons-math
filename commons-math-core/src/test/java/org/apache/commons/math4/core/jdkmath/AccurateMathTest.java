package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccurateMathTest {
    @Test
    public void testSlowLog() {
        double[] result = AccurateMathCalc.slowLog(2.0);
        double expectedResult = Math.log(2.0);
        double slowLogResponse  = result[0] + result[1];

        assertEquals(expectedResult, slowLogResponse);

    }

    @Test
    public void testExpInt() {

        double[] resultParam = new double[2];
        double expectedResult = Math.exp(2);

        resultParam[0] = 1;
        resultParam[1] = 1;

        double expIntResponse = AccurateMathCalc.expint(2, resultParam);
        assertEquals(expectedResult, expIntResponse);

    }
}
