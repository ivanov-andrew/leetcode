package ru.leetcode.array

// https://leetcode.com/problems/pascals-triangle/
fun main() {
    println(PascalTriangle().generate(5).joinToString(","))
}

class PascalTriangle {

    fun generate(numRows: Int): List<List<Int>> {
        if (numRows == 0) {
            return emptyList()
        }

        val result = mutableListOf<List<Int>>()
        var prev = mutableListOf(1)
        result.add(prev)

        var i = 2
        while (i <= numRows) {
            val current = mutableListOf<Int>()
            current.add(1)

            var j = 1
            while (j < i - 1) {
                current.add(prev[j - 1] + prev[j])
                j++
            }

            current.add(1)
            result.add(current)
            prev = current
            i++
        }
        return result
    }
}