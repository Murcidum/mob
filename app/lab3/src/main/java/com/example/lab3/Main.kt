package com.example.lab3

import com.example.lab3.decore.makeDecorations

fun buildAquarium() {
//    val aquarium1 = Aquarium()
//    aquarium1.printSize()
//
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
//
//    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//    aquarium4.printSize()

//    val aquarium6 = Aquarium(numberOfFish = 29)
//    aquarium6.printSize()
//    aquarium6.volume = 70
//    aquarium6.printSize()
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()

}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    buildAquarium()

    makeFish()

    makeDecorations()

    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")

//    val (tool, use) = equipment
//    println("$tool is used for $use")

    val list = listOf(1, 5, 3, 4)
    println(list.sum())

    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length })
    for (s in list2.listIterator()) {
        println("$s ")
    }

    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
    println (scientific.get("guppy"))
    println(scientific.get("zebra fish"))
    println(scientific.get("swordtail"))
    //println(scientific.getOrDefault("swordtail", "sorry, I don't know"))

    //println(scientific.getOrElse("swordtail") {"sorry, I don't know"}))

}