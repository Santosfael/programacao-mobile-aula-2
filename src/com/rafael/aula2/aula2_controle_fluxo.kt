package com.rafael.aula2

fun main() {

    val age = 18

    if (age >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }

    val result = if (age >= 18) "Maior de idade" else "Menor de idade"
    println(result)
}