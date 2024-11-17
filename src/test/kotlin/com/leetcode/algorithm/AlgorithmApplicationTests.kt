package com.leetcode.algorithm

import com.leetcode.algorithm.string.MinWindow
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.boot.test.context.SpringBootTest
import kotlin.math.min
import kotlin.test.assertEquals

@SpringBootTest
class AlgorithmApplicationTests {

	private val logger = LoggerFactory.getLogger(this::class.java)
	@Test
	fun contextLoads() {
	}

	@Test
	fun minWindowTests() {
		val minWindow = MinWindow()
		logger.info("Running LeetCode algorithm ...")
		assertEquals("BANC", minWindow.minWindow("ADOBECODEBANC", "ABC"))
		assertEquals("", minWindow.minWindow("a", "aa"))
//	println("Result: ${minWindow.minWindow("a", "aa")}")
//	println("Result: ${minWindow.minWindow("bdab", "ab")}")
//	println("Result: ${minWindow.minWindow("abc", "a")}")
		println("Result: ${minWindow.minWindow("bba", "ab")}")

	}

}
