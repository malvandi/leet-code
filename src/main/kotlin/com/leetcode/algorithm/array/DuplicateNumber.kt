package com.leetcode.algorithm.array

/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
class DuplicateNumber {
    fun findDuplicate(nums: IntArray): Int {
        var slow = 0
        var fast = 0

        do {
            slow = getNextCell(nums, slow)
            fast = getNextCell(nums, getNextCell(nums, fast))
        } while (fast != slow)

        slow = 0
        while (slow != fast) {
            slow = getNextCell(nums, slow)
            fast = getNextCell(nums, fast)
        }

        return fast
    }

    private fun getNextCell(nums: IntArray, currentValue: Int): Int = nums[currentValue]
}