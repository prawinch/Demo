package com.demo.kotlin

import com.demo.java.GameType

class ConditionalExmaple1 {
    fun simpleCondition(value: Int) {


        val (description: String, gameType: GameType) =
                when {
                    value < 10 -> Pair("", GameType.GS75)
                    value < 25 -> Pair("", GameType.CASINO)
                    else -> Pair("", GameType.SPORT)
                }
    }
}