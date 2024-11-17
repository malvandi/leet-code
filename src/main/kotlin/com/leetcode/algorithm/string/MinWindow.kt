package com.leetcode.algorithm.string

/**
 * https://leetcode.com/problems/minimum-window-substring/
 */
class MinWindow {

    private var leftIndex = -1
    private var rightIndex = -1
    private val windowCharMap = mutableMapOf<Char, Int>()
    private var smallWindow = ""

    fun minWindow(inputString: String, windowCharacters: String): String {
        smallWindow = inputString + inputString
        leftIndex = -1
        rightIndex = -1
        windowCharMap.clear()
        windowCharMap.putAll(windowCharacters.groupingBy { it }.eachCount().toMutableMap())


        refreshLeftIndex(inputString)
        if (indexIsValid(inputString, leftIndex))
            refreshRightIndex(inputString)

        while (indexIsValid(inputString, leftIndex)) {
            val candidate = inputString.substring(leftIndex, rightIndex + 1)
            if (candidate.length > smallWindow.length) {
                refreshLeftIndex(inputString)
                continue
            }

            if (windowCharMap.all { it.value <= 0 }) {
                smallWindow = candidate
                refreshLeftIndex(inputString)
                continue
            }

            val rightIndexCandidate = findNextMatchedIndex(inputString, rightIndex + 1)
            if (indexIsValid(inputString, rightIndexCandidate))
                refreshRightIndex(inputString)
            else
                refreshLeftIndex(inputString)
        }

        if (smallWindow == inputString + inputString)
            return ""

        return smallWindow
    }

    private fun refreshLeftIndex(inputString: String) {
        if (indexIsValid(inputString, leftIndex)) {
            val startChar = inputString[leftIndex]
            windowCharMap[startChar] = windowCharMap.getOrDefault(startChar, 0) + 1
        }

        leftIndex = findNextMatchedIndex(inputString, leftIndex + 1)
    }

    private fun refreshRightIndex(inputString: String) {
        val newCandidate = findNextMatchedIndex(inputString, rightIndex + 1)
        if (!indexIsValid(inputString, newCandidate))
            throw RuntimeException("Right index is invalid.")

        rightIndex = newCandidate
        var char = inputString[rightIndex]
        val count = windowCharMap[char] ?: throw RuntimeException("Never occur")
        windowCharMap[char] = count - 1
    }

    private fun indexIsValid(inputString: String, index: Int): Boolean {
        return index >= 0 && index < inputString.length
    }

    private fun findNextMatchedIndex(inputString: String, startIndex: Int): Int {
        var index = startIndex
        while (index < inputString.length) {
            var count = windowCharMap[inputString[index]]
            if (count != null)
                return index

            index++
        }

        return index
    }
}