package twoPointerTechnique


fun main(arg: Array<String>) {
    val arr = intArrayOf(1, 2, 3)
    arr.forEach { print(it) }
    val reverseArr = ReverseArr().reverseArr(arr)
    println()
    reverseArr.forEach { print(it) }
}

class ReverseArr {


    fun reverseArr(arr: IntArray): IntArray {

        var left = 0
        var right = arr.size - 1

        while (left < right) {
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp

            left += 1
            right -= 1
        }
        return arr
    }
}