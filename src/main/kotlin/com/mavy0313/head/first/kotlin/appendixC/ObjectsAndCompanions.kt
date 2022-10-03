package com.mavy0313.head.first.kotlin.appendixC


//object DuckFactory {
//  fun create() = Duck()
//}

class Duck {
  object DuckFactory {
    fun create(): Duck = Duck()
  }

  companion object {
    fun createFromCompanion(): Duck = Duck()
  }
}

fun Double.toDollar(): String {
  return "$$this"
}

fun main() {
  val duck = Duck.DuckFactory.create()
  val duck2 = Duck.createFromCompanion()

  println(duck)
  println(duck2)

  val startingPoint = object {
    val x = 0
    val y = 0
  }

  println(startingPoint)

  val dollars = 45.25
  println(dollars.toDollar())
}