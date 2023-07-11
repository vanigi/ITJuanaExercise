package org.itjuana.midlevel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Problem1Test {
    /**
     * Method under test: {@link Problem1#notInRange(List)}
     */
    @Test
    void testNotInRangeEmpty() {
        Problem1 problem1 = new Problem1();
        assertTrue(problem1.notInRange(new ArrayList<>()).isEmpty());
    }

    /**
     * Method under test: {@link Problem1#notInRange(List)}
     */
    @Test
    void testNotInRangeSuccesful() {
        Problem1 problem1 = new Problem1();

        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(2);
        inputList.add(5);
        inputList.add(6);
        List<Integer> actualNotInRangeResult = problem1.notInRange(inputList);
        assertEquals(2, actualNotInRangeResult.size());
        assertEquals(1, actualNotInRangeResult.get(0));
        assertEquals(3, actualNotInRangeResult.get(1));
    }

    /**
     * Method under test: {@link Problem1#notInRange(List)}
     */
    @Test
    void testNotInRangeEmptyResult() {
        Problem1 problem1 = new Problem1();

        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        assertTrue(problem1.notInRange(inputList).isEmpty());
    }
}

