package com.rafael.aula2

fun main() {

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    println(sum(3, 5))

    fun message(message: String) {
        println(message)
    }

    message("Olá, Kotlin!")

    fun double(x: Int) = x * 2

    println(double(4))

    fun greet(nome: String = "Mundo") {
        println("Olá, $nome!")
    }

    greet()         // Saída: Olá, Mundo!
    greet("Rafael") // Saída: Olá, Rafael!

    val square = { x: Int -> x * x }
    println(square(5)) // Saída: 25
}
