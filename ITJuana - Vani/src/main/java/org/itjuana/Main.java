package org.itjuana;

import org.itjuana.midlevel.Problem1;
import org.itjuana.midlevel.Problem2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(":::::: PROBLEM 1 ::::::");
        Problem1 p1 = new Problem1();
        Integer[] inputArray = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(p1.notInRange(Arrays.asList(inputArray)));
        inputArray = new Integer[]{1, 1};
        System.out.println(p1.notInRange(Arrays.asList(inputArray)));

        System.out.println(":::::: PROBLEM 2 ::::::");
        Problem2 p2 = new Problem2();
        inputArray = new Integer[]{2,7,11,15};
        System.out.println(p2.addUpTarget(Arrays.asList(inputArray),9));
        inputArray = new Integer[]{3,2,4};
        System.out.println(p2.addUpTarget(Arrays.asList(inputArray),6));
        inputArray = new Integer[]{3,3};
        System.out.println(p2.addUpTarget(Arrays.asList(inputArray),6));
    }
}