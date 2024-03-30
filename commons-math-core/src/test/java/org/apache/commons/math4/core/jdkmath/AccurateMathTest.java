/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
