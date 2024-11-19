package com.leetcode.algorithm.linklist

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class SwapPairs {
    fun swapPairs(head: ListNode?): ListNode? {
        if(head == null) return null

        var oldSection: ListNode? = null
        var pointer = head
        val newHead = if(pointer.next == null) head else pointer.next

        while(pointer != null) {
            val next = pointer.next
            if(next != null) {
                pointer.next = next.next
                next.next = pointer
                if(oldSection != null) oldSection.next = next
            }

            oldSection = pointer
            pointer = pointer.next
        }

        return newHead
    }
}