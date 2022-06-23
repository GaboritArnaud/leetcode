package fr.agaborit.leetcode.easy.validpalindrome;

import java.util.stream.Collectors;

public class Solution {

    public boolean isPalindrome(String s) {
        final String ALPHA_NUM = "[a-zA-Z0-9]";
        var str = s.chars()
                .filter(c -> (""+(char)c).matches(ALPHA_NUM))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining()).toLowerCase();
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
