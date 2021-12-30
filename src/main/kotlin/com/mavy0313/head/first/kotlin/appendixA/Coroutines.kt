package com.mavy0313.head.first.kotlin.appendixA

import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun runInCoroutines() {
    val start = System.nanoTime()
    runBlocking {
        repeat(10_000) { // launch a lot of coroutines
            launch {
                delay(1000L)
                print(".")
            }
        }
    }
    val execTime = (System.nanoTime() - start) / 1_000_000
    println("Coroutines execution time is:$execTime")
}

fun runInThreads() {
    val start = System.nanoTime()
    repeat(10_000) { // launch a lot of threads
        thread {
            Thread.sleep(1000L)
            print(".")
        }
    }
    Thread.currentThread().join()
    val execTime = (System.nanoTime() - start) / 1_000_000
    println("Threads execution time is:$execTime")
}

fun main() {
    runInCoroutines()
    runInThreads()
}