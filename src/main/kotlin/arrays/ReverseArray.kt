package arrays

import printValue


fun main(vararg args: String) {
    val input = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val output = ReverseArray()
        .reverse(
            input
        )

    output.printValue()
}


class ReverseArray {
    fun reverse(array: IntArray): IntArray {
        var start = 0
        var end = array.size - 1
        while (start < end) {
            val temp = array[start]
            array[start] = array[end]
            array[end] = temp
            start++
            end--
        }
        return array
    }
}