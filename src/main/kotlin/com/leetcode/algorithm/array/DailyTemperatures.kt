package com.leetcode.algorithm.array

/**
 * https://leetcode.com/problems/daily-temperatures/
 */
class DailyTemperatures {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val answer: IntArray = IntArray(temperatures.size) { 0 }

        val stack = ArrayDeque<Int>()
        for (index in temperatures.size - 1 downTo 0) {
            val value = temperatures[index]
            while (stack.isNotEmpty()) {
                val topIndex = stack.last()
                if (value < temperatures[topIndex]) {
                    answer[index] = topIndex - index
                    break
                }
                stack.removeAt(stack.lastIndex)
            }
            stack.add(index)
        }

        return answer
    }
}