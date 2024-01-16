fun main() {
    val dados: List<Receita> = geraDados()

    println(dados.filter { it.calorias > 500 })
}