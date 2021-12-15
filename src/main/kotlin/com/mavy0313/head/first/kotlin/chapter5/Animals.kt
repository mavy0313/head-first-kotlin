package com.mavy0313.head.first.kotlin.chapter5

open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }
}

open class Canine : Animal() {
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

open class Car(val make: String, val model: String) {

}

class ConvertibleCar(make_param: String, model_param: String) : Car(make_param, model_param) {

}

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
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
}