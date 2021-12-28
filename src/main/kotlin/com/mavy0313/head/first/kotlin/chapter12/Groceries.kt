package com.mavy0313.head.first.kotlin.chapter12

data class Grocery(val name: String, val category: String, val unit: String, val unitPrice: Double, val quantity: Int)

fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2))

    val highestUnitPrice = groceries.maxByOrNull { it.unitPrice }
    println("highest unit price is $highestUnitPrice")

    val lowestQuantity = groceries.minByOrNull { it.quantity }
    println("lowest quantity is $lowestQuantity")

    val sumQuantity = groceries.sumOf { it.quantity }
    println("sum quantity is $sumQuantity")

    val totalPrice = groceries.sumOf { it.quantity * it.unitPrice }
    println("total price is $totalPrice")

    val vegetables = groceries.filter { it.category == "Vegetable" }
    println("vegetables: $vegetables")

    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("not frozen: $notFrozen")

    val groceryNames = groceries.map { it.name }
    println("groceryNames: $groceryNames")

    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
    println("halfUnitPrice: $halfUnitPrice")

    val newPrices = groceries
        .filter { it.unitPrice > 3.0 }
        .map { it.unitPrice * 2 }

    println("newPrices: $newPrices")

    println("Grocery names: ")
    groceries.forEach { println(it.name) }

    println("Groceries with unit price > 3.0: ")
    groceries
        .filter { it.unitPrice > 3.0 }
        .forEach { println(it.name) }

    var itemNames = ""
    groceries.forEach { itemNames += "${it.name} " }
    println("itemNames: $itemNames")

    groceries.groupBy { it.category }.forEach {
        println(it.key)
        it.value.forEach { println("  ${it.name}") }
    }

    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println("sum of ints:$sumOfInts")

    val productOfInts = ints.fold(1) { runningProduct, item -> runningProduct * item }
    println("productOfInts: $productOfInts")

    val names = groceries.fold("") { string, item -> string + " ${item.name}" }
    println("names: $names")

    val changeFrom50 = groceries.fold(50.0) { change, item -> change - (item.unitPrice * item.quantity) }
    println("change from 50: $changeFrom50")

    val spentOnVegetables = groceries
        .filter { it.category == "Vegetable" }
        .sumOf {  it.unitPrice * it.quantity }

    println("spent on vegetables: $spentOnVegetables")

    val totalPriceLessThen5 = groceries
        .filter { it.unitPrice * it.quantity < 5.0 }
        .map { it.name }

    println("total price less then 5: $totalPriceLessThen5")

//    totalCostOfEachCategory
    groceries
        .groupBy { it.category }
        .forEach {
            println(it.key)
//            val cost = it.value.fold(0.0) { runningSum, item -> runningSum + (item.unitPrice * item.quantity) }
            val cost = it.value.sumOf { it.unitPrice * it.quantity }
            println("  $cost")
        }

    groceries
        .filterNot { it.unit == "Bottle" }
        .groupBy { it.unit }
        .forEach {
            println(it.key)
            it.value.forEach { println("  ${it.name}") }
        }
}