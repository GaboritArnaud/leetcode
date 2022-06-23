package fr.agaborit.leetcode.easy.singlenumber;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public int singleNumber(int[] nums) {
        var set = new HashSet<Integer>();
        Arrays.stream(nums).forEach(i -> {
            if (!set.remove(i)) {
                set.add(i);
            }
        });
        return set.stream().findFirst().orElse(-1);
    }

}
