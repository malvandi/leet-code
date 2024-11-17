package com.leetcode.algorithm.array

/**
 * https://leetcode.com/problems/container-with-most-water/description/
 */
class MaxArea {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1

        var area = 0
        while (left < right) {
            var newArea = getArea(height, left, right)
            if(newArea > area) {
                area = newArea
            }

            if (height[left] < height[right])
                left++
            else
                right--
        }

        return area
    }

    private fun getArea(height: IntArray, left: Int, right: Int): Int {
        return (right - left) * minOf(height[left], height[right])
    }
}