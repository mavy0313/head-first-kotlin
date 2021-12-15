package com.mavy0313.head.first.kotlin.chapter7

import java.util.concurrent.CompletableFuture
import java.util.stream.Stream

//data class Recipe(val title: String, val isVegetarian: Boolean)

fun main(args: Array<String>) {
    val r1 = Recipe("Chicken", "ingredient")
    val r2 = Recipe("Chicken", "ingredient")

    println("r1 and r2 are equal=${r1.equals(r2)}")
    println("r1 and r2 are equal=${r1 == r2}")
    println("r1 hashcode=${r1.hashCode()}")
    println("r2 hashcode=${r2.hashCode()}")
    println("r1 toString=${r1.toString()}")
    println("r2 toString=${r2.toString()}")

    val r3 = Recipe("Thai Curry", "ingredient")
    val r3copy = r3.copy(isVegetarian = true)

    println("r3:$r3")
    println("r3copy:$r3copy")

    val recipes = Stream.of(r1, r2).filter { it.isVegetarian }.count()
    println("vegetarian recipe count:$recipes")
//    val futurePrice: CompletableFuture<Double> = CompletableFuture.supplyAsync { () -> 2.23 }

}

fun getPrice(): Double {
    Thread.sleep(1000);
    return 1.23
}