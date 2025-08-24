package com.rafael.aula2

fun main() {

    var name: String? = "Rafael"
    name = null // OK
    println(name?.length) // retorna null, não lança exceção

    val length = name?.length ?: 0
    println(length) // Se nome for nulo, retorna 0

    // println(name!!.length) // Vai lançar exceção se nome for null!


    fun showFirstLetter(name: String?) {
        val firstLetter = name?.firstOrNull() ?: '-'
        println("Primeira letra: $firstLetter")
    }

    showFirstLetter("Rafael") // Primeira letra: R
    showFirstLetter(null)     // Primeira letra: -

    // Resposta Exercicio
    fun printEmail(email: String?) {
        println(email?.uppercase() ?: "E-mail não informado")
    }

}