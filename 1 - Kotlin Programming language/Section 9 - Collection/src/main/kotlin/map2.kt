fun main() {
    val dados: List<Receita> = geraDados()

    // Cria uma nova lista somente com o nome da receita
    println(dados.map { it.nome })
}