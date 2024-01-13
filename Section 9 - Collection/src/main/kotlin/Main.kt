fun main() {

    //lists (Arrays em JS)
    val lst1: List<Int> = listOf(1, 2, 3, 4, 5)
    val lst2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(lst2[0])
    println(lst2.size)

    //adiciona a coleção
    lst2.add(8)
    lst2.add(10)

    //Remove o elemento
    lst2.remove(8)

    //remove no Index
    lst2.removeAt(0)

    //Verifica se a lista contem o elemento
    println(lst2.contains(5))

    println(lst2)

    //Limpa a lista
    lst2.clear()

    println(lst2)
}