package com.demo.kotlin


fun maxOfTwoNumbers(a: Int, b: Int): Int = if (a>b) a else b



fun displayMaxNumber (a: Int, b:Int) = println(maxOfTwoNumbers(a, b))


fun main() {
    displayMaxNumber(75, 6)
}