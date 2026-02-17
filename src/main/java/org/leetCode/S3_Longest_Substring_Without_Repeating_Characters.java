package org.leetCode;

public class S3_Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        int highestLength=0;
        String highestString="";
        for(int i=0;i<s.length();i++) {
            highestString=String.valueOf(s.charAt(i));
            for(int j=i+1;j<s.length();j++) {
                if (highestString.indexOf(s.charAt(j)) == -1) {
                    highestString+=(s.charAt(j));
                } else {
                    break;
                }
            }
            if (highestLength<highestString.length()) {
                highestLength=highestString.length();
            }
        }
        return highestLength;
    }
}
