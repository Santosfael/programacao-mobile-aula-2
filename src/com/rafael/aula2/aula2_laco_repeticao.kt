package com.rafael.aula2

fun main() {

    for (i in 1..5) {
        println("Valor de i: $i")
    }

    val names = listOf("Ana", "Beto", "Carlos")
    for ((index, name) in names.withIndex()) {
        println("$index: $name")
    }
}

