package com.rafael.aula2

fun main() {

    // List
    val numbers = listOf(1, 2, 3, 3, 4)
    println(numbers[2]) // Saída: 3

    for (number in numbers) {
        println(number)
    }

    val pares = numbers.filter { it % 2 == 0 }
    println(pares) // Saída: [2, 4, 4]

    val names = listOf("Alice", "Bruno", "Joana", "Bruno")
    val namesUppercase = names.map { it.uppercase() }
    println(namesUppercase) // Saída: [ALICE, BRUNO, JOANA, BRUNO]

    // MutableList

    val animals = mutableListOf("cachorro", "gato", "pássaro")
    animals.add("peixe")
    println(animals)

    /// Remover o animal da lista pelo elemento
    animals.remove("gato")
    println(animals)

    /// Remover o animal da lista pelo indice
    animals.removeAt(0)
    println(animals)

    animals[1] = "hamster"
    println(animals)

    animals.addAll(listOf("aranha", "sapo"))
    println(animals)

    // Set

    val setImmutable = setOf("maçã", "banana", "maçã", "laranja")
    println(setImmutable) // Saída: [maçã, banana, laranja] – só elementos únicos!

    // MutableSet
    val setA = setOf(1, 2, 3)
    val setB = setOf(3, 4, 5)

    val uniao = setA + setB           // União [1, 2, 3, 4, 5]
    val interseccao = setA.intersect(setB) // Interseção [3]
    val diferenca = setA.subtract(setB)    // Diferença [1, 2]
    println(uniao)
    println(interseccao)
    println(diferenca)

    val names1 = mutableSetOf("Rafael", "Ana", "Bia")
    names1.add("Carlos")    // Adiciona "Carlos"
    names1.add("Ana")       // Não adiciona, pois "Ana" já existe
    println(names1)         // Exemplo de saída: [Rafael, Ana, Bia, Carlos]

    val setMutable = mutableSetOf("A", "B")
    setMutable.add("C")
    setMutable.add("A") // Não será adicionado, pois "A" já existe
    println(setMutable) // Saída: [A, B, C]

    // Map
    val mapImutable = mapOf(
        "nome" to "Rafael",
        "idade" to 32,
        "cidade" to "São Paulo"
    )
    println(mapImutable["nome"])      // Saída: Rafael
    println(mapImutable["idade"])     // Saída: 32
    println(mapImutable["cidade"])    // Saída: São Paulo

    val map = mapOf("A" to 1, "B" to 2)
    for ((key, value) in map) {
        println("$key -> $value")
    }

    // MutableMap
    val contacts = mutableMapOf(
        "Rafael" to "rafael@email.com",
        "Ana" to "ana@email.com"
    )
    println(contacts)

    contacts["Bia"] = "bia@email.com"           // Adiciona novo par
    contacts["Rafael"] = "rafael@novo.com"      // Atualiza valor da chave "Rafael"
    println(contacts)

    contacts.remove("Ana")
    println(contacts)

    val emailBia = contacts["Bia"]
    println(emailBia)
}