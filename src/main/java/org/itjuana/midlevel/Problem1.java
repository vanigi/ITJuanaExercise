package org.itjuana.midlevel;

//Problem 1
//Given a list nums of n integers where nums[i] is in the range [1, list length], write a function
//that solves the following problem; return a list of all the integers in the range [1, list length]
//that do not appear in nums.
//Example 1:
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//Example 2:
//Input: nums = [1,1]
//Output: [2]

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public List<Integer> notInRange(List<Integer> inputList){
        List<Integer> notInRangeList = new ArrayList<>();
        //Iterate the input list and use the same index to compare
        for (int i = 1; i <= inputList.size(); i++) {
            //there is no need to do anything if the index is in the inputList
            if(inputList.contains(i)) continue;
            //add it to the result list if the index is not in the list values
            else notInRangeList.add(i);
            //in this case there is no need for curly braces because conditional
            //blocks are one-liners
        }
        return notInRangeList;
    }
}