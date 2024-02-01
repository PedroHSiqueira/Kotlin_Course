fun main() {
    val lista: List<Int> = listOf(1,2,3,4,5)

    //O sum realiza a soma dos numeros de uma lista
    //Pode ser usada em listas de INT, DOUBLE, FLOAT
    println(lista.sum())

    val dados = geraDados()

    //sumOf você seleciona o que deseja contar da lista
    // o it referencia o objeto, neste caso a receita
    println(dados.sumOf { it.calorias })
}