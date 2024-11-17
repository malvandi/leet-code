package com.leetcode.algorithm.array

/**
 * https://leetcode.com/problems/maximum-average-subarray-i/description/
 */
class MaxAverage {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        if (nums.size < k)
            return 0.0
        var topRangeSum = nums.take(k).sum()
        var lastRangeSum = topRangeSum
        for (i in k..<nums.size) {
            val newRangeSum = lastRangeSum - nums[i - k] + nums[i]
            if(newRangeSum > topRangeSum)
                topRangeSum = newRangeSum

            lastRangeSum = newRangeSum
        }

        return topRangeSum.toDouble() / k.toDouble()
    }
}