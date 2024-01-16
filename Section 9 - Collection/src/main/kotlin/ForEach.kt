fun main() {
    val dados: List<Receita> = geraDados()

    //O forEach ira passar por todos os elementos da lista
    dados.forEach { println(it.nome) }

    //Combinação de Filter e ForEach
    dados.filter { it.calorias > 500 }.forEach { println(it.nome) }
}