package com.rafael.aula2

fun main() {

    // Numéricos - Inteiro
    val byte: Byte = 10
    val short: Short = 32_767
    val int: Int = 30_000_000
    val long: Long = 1234578965431

    // Numéricos - Flutuantes
    val float: Float = 32f
    var double: Double = 3.14

    // Literais
    val char: Char = 'c'
    val string: String = "Olá mundo"
    val string2: String = """
        Rafael,
        32 anos
    """.trimIndent()
    val string3: String = "${char}"

    // Boolean
    val boolean: Boolean = false
}