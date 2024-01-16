fun main() {
    val dados: List<Receita> = geraDados()

    //Pega os primeiros numeros, o numero dependo do que for passado no parametro
    println(dados.take(2))

    //Pega os Ultimos numeros, o numero dependo do que for passado no parametro
    println(dados.takeLast(2))
}