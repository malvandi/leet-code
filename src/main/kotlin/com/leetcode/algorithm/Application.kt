package com.leetcode.algorithm

import com.leetcode.algorithm.array.DailyTemperatures
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AlgorithmApplication

fun main(args: Array<String>) {
    val algorithm = DailyTemperatures()

    val testcase1 = arrayOf(73, 74, 75, 71, 69, 72, 76, 73).toIntArray()
    val result1 = algorithm.dailyTemperatures(testcase1)
    println("Result 1: ${result1.toTypedArray().contentToString()}")
//    println("3 == $result1 => ${result1 == 3}")

//    val testcase2 = arrayOf(1, 3, 4, 2, 2).toIntArray()
//    val result2 = algorithm.dailyTemperatures(testcase2)
//    println("2 == $result2 => ${result2 == 2}")
//
//
//    val testcase3 = arrayOf(3, 3, 3, 3, 3).toIntArray()
//    val result3 = algorithm.dailyTemperatures(testcase3)
//    println("3 == $result3 => ${result3 == 3}")
//
//
//    val testcase4 = arrayOf(1, 2, 2).toIntArray()
//    val result4 = algorithm.dailyTemperatures(testcase4)
//    println("2 == $result4 => ${result4 == 2}")
//
//    val testcase5 = arrayOf(2, 5, 9, 6, 9, 3, 8, 9, 7, 1).toIntArray()
//    val result5 = algorithm.dailyTemperatures(testcase5)
//    println("9 == $result5 => ${result5 == 9}")


//	runApplication<AlgorithmApplication>(*args)
}
