fun main() {
    val dados: List<Receita> = geraDados()

    //Retorna o valor maximo
    println( dados.maxOf { it.calorias })

    //Retorna o valor minimo
    println(dados.minOf { it.calorias })

    //Retorna o objeto inteiro
    println(dados.maxByOrNull { it.calorias })

    //Retorna o objeto inteiro
    println(dados.minByOrNull { it.calorias })
}