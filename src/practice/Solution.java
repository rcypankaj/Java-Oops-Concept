package practice;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        int count = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == count) {
                subList.add(count++);
                if (i == nums.length-1) {
                    list.add(subList);
                }
            } else {
                count = nums[i];
                list.add(subList);
                subList = new ArrayList<>();
                subList.add(count++);
                if (i == nums.length-1) {
                    list.add(subList);
                }
            }
        }
        for (List<Integer> l1 : list) {
            System.out.println(l1);
        }
        return result;
    }
}