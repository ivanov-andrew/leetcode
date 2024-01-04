package ru.leetcode.array

// https://leetcode.com/problems/two-sum/
fun main() {
    println(TwoSum().twoSum(intArrayOf(2, 7, 11, 15), 9).joinToString(","))
}

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexByValue = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            if (indexByValue.contains(target - num)) {
                return intArrayOf(indexByValue[target - num]!!, index)
            } else {
                indexByValue[num] = index
            }
        }
        return intArrayOf()
    }
}