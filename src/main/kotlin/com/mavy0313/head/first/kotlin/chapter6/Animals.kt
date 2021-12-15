package com.mavy0313.head.first.kotlin.chapter6

interface Roamable {
//    val velocity: Int

    fun roam()
//    fun roam2 () {
//
//    }
}

abstract class Animal : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()


    override fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }
}

abstract class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooooowl!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }

}

class Hippo : Animal() {
    override val image = "Hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
    }
}

fun main(args: Array<String>) {
    val wolf = Wolf()
    wolf.makeNoise()
    wolf.roam()
    wolf.sleep()

    val animal: Animal = Wolf()
    animal.eat()

    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    vet.giveShot(wolf)
    vet.giveShot(Hippo())

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())

    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }

    val x = 6
    when (x) {
        0 -> println("x is 0")
        1, 2 -> println("x is 1 or 2")
        else -> println("x is not 0 and not 1 and not 2")
    }

    val animal2 = Hippo()
    if (animal2 is Hippo) {
        println ("animal2 is Hippo")
    }
    val animal2asAnimal = animal2 as Animal
    animal2asAnimal.eat()
}