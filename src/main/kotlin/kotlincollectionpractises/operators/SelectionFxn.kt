package kotlincollectionpractises.operators


fun main(vararg args:String){
    SelectionFxn().demos()
}

//any, none, all
class SelectionFxn {

    data class Person(
        val name:String,
        val age: Int,
        val driverLicense: Boolean = false
    )

    fun demos(){
        val friendGroup = listOf(
            Person("Joe", 19),
            Person("Mic", 15),
            Person("Marry", 33, true),
            Person("Cal", 19)
        )

        println("Anyone hold DrivingLicense: ${friendGroup.any { it.driverLicense }}")
        println("None of them is below adult age: ${friendGroup.none { it.age < 18 }}")
        println("All have name of 4 digits: ${friendGroup.all { it.name.length > 4 }}")

    }
}