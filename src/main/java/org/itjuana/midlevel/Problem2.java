package org.itjuana.midlevel;

import java.util.ArrayList;
import java.util.List;

//Problem 2
//Given a list of integers nums and an integer target, write a function that solves the following
//problem; return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the
//same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]
public class Problem2 {
    public List<Integer> addUpTarget(List<Integer>integerList, int target){
        List<Integer> indexArray = new ArrayList<>();
        //declare a tag for later reference
        out:
        //use foreach since we will need the values once
        for (Integer number:integerList) {
            //iterate the rest of the values
            for (int i = 1; i <= integerList.size()-1; i++) {
                //if the addition is equals to the target, add both indexes and break
                //all the loops using the previous tag since the one solution has been found
                int addResult = Math.addExact(number,integerList.get(i));
                if (addResult==target) {
                    //we add the first index until this moment to save lines of code
                    indexArray.add(integerList.indexOf(number));
                    indexArray.add(i);
                    break out;
                }
            }
        }
        return indexArray;
    }
}
