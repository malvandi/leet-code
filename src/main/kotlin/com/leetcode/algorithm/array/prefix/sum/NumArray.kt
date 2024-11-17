package com.leetcode.algorithm.array.prefix.sum

import com.leetcode.algorithm.util.Util

/**
 * https://leetcode.com/problems/range-sum-query-immutable/
 */
class NumArray(nums: IntArray) {

    private val sumArray = Util.generateArraySum(nums)

    fun sumRange(left: Int, right: Int): Int {
        if(left == 0)
            return sumArray[right]
        return sumArray[right] - sumArray[left - 1]
    }

}