package com.mavy0313.head.first.kotlin.chapter2

fun main() {
    var x: Int = 5
    var y = 0xAB
    var z = 0b1
    var smallNum: Short = 10
//    smallNum instanceof Any

    var a = 5
    var b = a
    var c: Long = a.toLong()
    println(x)
    println("x is $x")
    println(if (x < 5) "x less then 5" else "x is equal or greater then 5")

    if (x < 5)
        println("x less then 5")
    else if (x == 5)
        println("x is equal to 5")
    else
        println("x is greater then to 5")

    when {
        x < 5 -> println("x less then 5")
        x == 5 -> println("x is equal to 5")
        else -> println("x is greater then to 5")
    }


    var myArray = arrayOf(1, 2, 3)
    println(myArray)
    println(myArray[0])
    println(myArray.size)
}