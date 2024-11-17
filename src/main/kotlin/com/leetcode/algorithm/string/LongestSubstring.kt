package com.leetcode.algorithm.string

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
class LongestSubstring {

    fun lengthOfLongestSubstring(s: String): Int {
        if(s.isEmpty())
            return 0

        var start = 0
        var end = 1

        var longestSubstring = s[0].toString()
        var substring = longestSubstring

        while (end < s.length) {
            var char = s[end]
            if(substring.contains(char)) {
                start += substring.indexOf(char) + 1
                substring = s.substring(start, end + 1)
            } else {
                substring += char
                if (substring.length > longestSubstring.length) {
                    longestSubstring = substring
                }
            }

            end++
        }
        return longestSubstring.length
    }
}