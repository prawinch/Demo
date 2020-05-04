package com.demo.kotlin.adventuregame

data class Location(val destinationId: Int, val description: String) {

    val exits = mutableMapOf<String, Int>()

    init {
        exits["Q"] = 0;
    }

    fun addExit(direction: String, destinationId: Int) {
        exits[direction] = destinationId
    }

}