package arrays
// https://leetcode.com/problems/two-sum/

fun main(vararg args:String){

    TwoSum()
        .twoSum(
            intArrayOf(3,2,4),
            6
        ).forEach {
            print("$it, ")
        }
}

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        val hashmap = mutableMapOf<Int,Int>()
        for((index, num) in nums.withIndex()){
            val compliment = target - num
            if(hashmap.containsKey(compliment)){
                return intArrayOf(index, hashmap[compliment]!!)
            }
            hashmap[num] = index
        }
        return result
    }


    //answer by CHAT-GPT
    fun twoSumChatGPT(nums: IntArray, target: Int): IntArray {
        val numMap = mutableMapOf<Int, Int>()

        for ((index, num) in nums.withIndex()) {
            val complement = target - num

            if (numMap.containsKey(complement)) {
                return intArrayOf(numMap[complement]!!, index)
            }

            numMap[num] = index
        }

        throw IllegalArgumentException("No two sum solution")
    }

}