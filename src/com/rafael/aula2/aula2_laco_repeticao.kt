package com.rafael.aula2

fun main() {

    for (i in 1..5) {
        println("Valor de i: $i")
    }

    val names = listOf("Ana", "Beto", "Carlos")
    for ((index, name) in names.withIndex()) {
        println("$index: $name")
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println("i: $i")
    }
}

