//https://leetcode.com/problems/longest-common-prefix/

import java.util.Arrays;

class LongestCommonPrefix {
       public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                result.append(strs[0].charAt(i));
            } else
                break;

        }
        return result.toString();
    }
}