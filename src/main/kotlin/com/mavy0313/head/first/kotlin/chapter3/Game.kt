package com.mavy0313.head.first.kotlin.chapter2

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)

//    println(max(5, 4))
//    for (x in 1..10) println(x)
//    for (x in 1 until 10 step 2) println(x)
//    for (x in 10 downTo 1) println(x)
//    for (item in options) println(item)
//    for ((index, item) in options.withIndex()) println("$item has index: $index")

    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors")
        || (userChoice == "Paper" && gameChoice == "Rock")
        || (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"

    println("You chose $userChoice. I chose $gameChoice. $result")
}

//fun max (a: Int, b: Int): Int {
//    val maxValue = if (a > b) a else b
//    return maxValue
//}

//fun max(a: Int, b: Int): Int = if (a > b) a else b
fun max(a: Int, b: Int) = if (a > b) a else b

fun getGameChoice(optionParams: Array<String>) =
    optionParams[(Math.random() * optionParams.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {

    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        val userInput = readLine()
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }

        if (!isValidChoice) println("You must enter a valid choice")
    }
    return userChoice
}

