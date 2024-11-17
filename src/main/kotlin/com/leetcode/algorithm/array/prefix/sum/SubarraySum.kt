package com.leetcode.algorithm.array.prefix.sum

import com.leetcode.algorithm.util.Util

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 */
class SubarraySum {

    fun subarraySum(nums: IntArray, k: Int): Int {
        val sumArray = Util.generateArraySum(nums)

        var count = 0
        for(index in nums.indices) {
            for (j in index.downTo(0)) {
                val sum = sumRange(sumArray, j, index)
                if(sum == k)
                    count++
            }
        }
        return count
    }

    private fun sumRange(array: IntArray, left: Int, right: Int): Int {
        if(left == 0)
            return array[right]
        return array[right] - array[left - 1]
    }
}