package com.mavy0313.head.first.kotlin.chapter4

class Song(val title: String, val artist: String) {

    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}


fun main(args: Array<String>) {
    val songOne = Song("The Mesopotamians", "They might be giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make me smile", "Steve Harley")

    songTwo.play()
    songTwo.stop()
    songThree.play()

}