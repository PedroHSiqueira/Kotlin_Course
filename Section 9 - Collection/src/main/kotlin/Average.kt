fun main() {
    val dados: List<Receita> = geraDados()

    // o Average realiza a media dos valores
    println(dados.map { it.calorias }.average())
}