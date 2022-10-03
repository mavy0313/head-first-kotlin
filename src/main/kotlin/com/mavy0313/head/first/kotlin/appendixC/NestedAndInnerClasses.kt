package com.mavy0313.head.first.kotlin.appendixC

class Outer {
  val x = "outer x"

  class Nested {
    val y = "Nested y"
    fun nestedFun() = "This is a nested fun"
//    fun getX() = "Value of x is $x" can't access outer property from nested class use inner instead
  }

  inner class Inner {
    val z = "Inner z"
    fun innerFun() = "This is an inner fun"
    fun getX() = "Value of x is $x"
  }
}

fun main() {
  val nested = Outer.Nested()
  println(nested.y)
  println(nested.nestedFun())

  val inner = Outer().Inner()
  println(inner.z)
  println(inner.innerFun())
  println(inner.getX())
}