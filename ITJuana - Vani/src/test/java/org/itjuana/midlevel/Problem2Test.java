package org.itjuana.midlevel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Problem2Test {
    /**
     * Method under test: {@link Problem2#addUpTarget(List, int)}
     */
    @Test
    void testAddUpTargetEmpty() {
        Problem2 problem2 = new Problem2();
        assertTrue(problem2.addUpTarget(new ArrayList<>(), 2).isEmpty());
    }

    /**
     * Method under test: {@link Problem2#addUpTarget(List, int)}
     */
    @Test
    void testAddUpTargetSuccesful() {
        Problem2 problem2 = new Problem2();
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(4);
        integerList.add(6);
        List<Integer> addUpTargetResult = problem2.addUpTarget(integerList,10);
        assertEquals(2, addUpTargetResult.size());
        assertEquals(1, addUpTargetResult.get(0));
        assertEquals(2, addUpTargetResult.get(1));
    }

    /**
     * Method under test: {@link Problem2#addUpTarget(List, int)}
     */
    @Test
    void testAddUpTargetEmptyResult() {
        Problem2 problem2 = new Problem2();
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(4);
        integerList.add(1);
        integerList.add(9);
        integerList.add(24);
        integerList.add(0);
        assertTrue(problem2.addUpTarget(integerList, 27).isEmpty());
    }
}

