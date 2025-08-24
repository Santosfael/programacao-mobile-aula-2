package com.rafael.aula2

fun main() {

    var age = 18

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

    val message = if (age >= 18) {
        println("Verificando idade...")
        "Maior de idade"
    } else {
        println("Verificando idade...")
        "Menor de idade"
    }
    println(message)

    val day = 3

    val dayName = when (day) {
        1 -> "Domingo"
        2 -> "Segunda"
        3 -> "Terça"
        4 -> "Quarta"
        5 -> "Quinta"
        6 -> "Sexta"
        7 -> "Sábado"
        else -> "Dia inválido"
    }
    println(dayName)   // Saída: Terça

    age = 23

    when (age) {
        in 0..12 -> println("Criança")
        in 13..17 -> println("Adolescente")
        in 18..59 -> println("Adulto")
        in 60..150 -> println("Idoso")
        else -> println("Idade inválida")
    }
}