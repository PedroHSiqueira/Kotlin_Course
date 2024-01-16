fun main() {
    val dados: List<Receita> = geraDados()

    val lista1 = listOf(1,2,3,4,5,5,6,7,8,8,9,10)

    // o Distinct ira eliminar os elementos repetidos
    println(lista1.distinct())

    // o Sorted coloca a lista em ordem crescente
    println(lista1.sorted())

    //o sortedDescending coloca a lista em ordem decrescente
    println(lista1.sortedDescending())

    // o Reverse inverte a lista na ordem original
    println(lista1.reversed())
}