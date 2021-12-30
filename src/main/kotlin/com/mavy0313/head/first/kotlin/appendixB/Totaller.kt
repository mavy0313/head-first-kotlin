package com.mavy0313.head.first.kotlin.appendixB

class Totaller(var total: Int = 0) {

    fun add(num: Int): Int {
        total += num
        return total
    }
}
