package com.example.lab1

fun main() {
    println("Hello World!")
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    val b2: Byte = 1
    println(b2)

    val i4: Int = b2.toInt()
    println(i4)

    val i5: String = b2.toString()
    println(i5)

    val i6: Double = b2.toDouble()
    println(i6)

    //val numberOfFish = 5
    //val numberOfPlants = 12
    //"I have $numberOfFish fish" + " and $numberOfPlants plants"

    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }

    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }


    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }

    var marbles: Int? = null

    var fishFoodTreats = 6
    fishFoodTreats = fishFoodTreats?.dec() ?: 0

    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    val school2 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school2))

    val numbers = intArrayOf(1,2,3)
    val numbers2 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers2
    println(foo2[5])

    for (element in school) {
        print(element + " ")
    }

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }

}