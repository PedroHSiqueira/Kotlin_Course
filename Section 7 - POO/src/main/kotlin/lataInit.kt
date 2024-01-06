class Receita{
    //o lateinit permite que a variavel seja inicializada sem um valor, mas deve ser atribuido depois
    // e com ele, a variavel só ocupa memoria quando for inicializada
    lateinit var instrucoes: String

    fun geraReceita(){
        instrucoes = "Lave as mãos"
    }

    fun verificaInicializacao(){
        if (!this::instrucoes.isInitialized){
            instrucoes = "Não está inicializada"
        }else{
            println("Foi inicializada")
        }
    }
}

fun main() {
    val r = Receita()
    r.geraReceita()
    r.verificaInicializacao()
    println(r.instrucoes)
}