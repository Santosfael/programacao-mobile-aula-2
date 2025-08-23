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

    val grade = 8

    val situation = if (grade >= 7) {
        "Aprovado"
    } else if (grade >= 5) {
        "Recuperação"
    } else {
        "Reprovado"
    }
    println(situation)
}