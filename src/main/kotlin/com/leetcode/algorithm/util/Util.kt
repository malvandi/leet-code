package com.leetcode.algorithm.util

class Util {

    companion object {
        fun generateArraySum(nums: IntArray): IntArray {
            val sumArray = IntArray(nums.size) { 0 }

            var sum = 0
            nums.forEachIndexed { index, value ->
                sum += value
                sumArray[index] = sum
            }

            return sumArray
        }
    }
}