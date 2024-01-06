fun main() {
    val pessoaParaExecucao: Pessoa = Pessoa(2004, "Pedro")

    //o with é usado para executar metodos quando o nome da intancia é muito grande
    with(pessoaParaExecucao){
        acordar()
        dormir()
    }

    // os metodos foram chamados sem precisar do pessoaParaExecucao.
}